package DP;

import java.util.Arrays;

public class No4_GoldMine_3 {

    private int dp(int[][] arr, int sx, int sy){
        int answer = 0;
        int[][] DT = new int[arr.length][arr[0].length];

        DT[sx][sy] = arr[sx][sy];
        int dx[] = {-1, 0, 1};
        int dy[] = {-1, -1, -1};

        System.out.println("arr(0,3) : "+arr[0][3]);
        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<arr.length; i++){
                int max =0;
                for(int k=0; k<dx.length; k++){
                    int x = i+dx[k];
                    int y = j+dy[k];
                    if(x<0 || y<0 || x >= arr.length || y >= arr[i].length )
                        continue;
                    if(i==0 && j ==3) System.out.println("(0,3) 검사 "+x+","+y + " : "+DT[x][y]);
                        max = Math.max(max, DT[x][y]);
                }
                DT[i][j] = max + arr[i][j];
            }
        }

        System.out.println();
        for(int[] i : DT)
            System.out.println(Arrays.toString(i));

        for(int i=0; i<DT.length; i++){
            for(int j=0; j<DT[i].length; j++){
                answer = Math.max(answer, DT[i][j]);
            }
        }
        return answer;
    }

    private int solution(int[][] arr, int start){
        int answer = 0;
        int x = start -1;
        int y = 0;
        answer = dp(arr, x, y);
        return answer;
    }
    public static void main(String[] args){
        int start = 2;
        int answer = 0;
        int[][] arr = {
              {1, 3, 3, 2}
            , {2, 1, 4, 1}
            , {0, 6, 4, 7}
        };
        System.out.println("입력배열 1 : ");
        for(int[] i : arr)
            System.out.println(Arrays.toString(i));
        answer = new No4_GoldMine_3().solution(arr, start);
        System.out.println("우3방향으로 이동 가능 시 최대 채굴 금의 양(19) : "+answer);

        int[][] arr2 = {
              {1, 3, 1, 5}
            , {2, 2, 4, 1}
            , {5, 0, 2, 3}
            , {0, 6, 1, 2}
        };
        System.out.println("입력배열 2 : ");
        for(int[] i : arr2)
            System.out.println(Arrays.toString(i));
        answer = new No4_GoldMine_3().solution(arr2, start);
        System.out.println("우3방향으로 이동 가능 시 최대 채굴 금의 양 : "+answer);

    }
}
