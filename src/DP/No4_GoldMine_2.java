package DP;

import java.util.Arrays;

public class No4_GoldMine_2 {
    int ttt = 10000;
    private int dp(int[][] arr, int x, int y, int num){
        if(ttt-- < -1) return 0;
        if(x < 0 || y < 0 || x >= arr.length || y >= arr[x].length)
            return 0;
        int[] dx = {-1, 0, 1};
        int[] dy = {1, 1, 1};
        num += arr[x][y];
        int max = 0;
        System.out.println("("+x+","+y+")"+num);
        for(int i=0; i<dx.length; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            return num += max = Math.max(max, dp(arr, x+dx[i], y+dy[i], num));
        }
        return num;
    }

    private int solution(int[][] arr, int start){
        int answer = 0;
        int x = start -1;
        int y = 0;
        answer = dp(arr, x, y, 0);
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
        answer = new No4_GoldMine_2().solution(arr, start);
        System.out.println("우3방향으로 이동 가능 시 최대 채굴 금의 양(19) : "+answer);
/*
        int[][] arr2 = {
              {1, 3, 1, 5}
            , {2, 2, 4, 1}
            , {5, 0, 2, 3}
            , {0, 6, 1, 2}
        };
        System.out.println("입력배열 2 : ");
        for(int[] i : arr2)
            System.out.println(Arrays.toString(i));
        answer = new No4_GoldMine_2().solution(arr2, start);
        System.out.println("우3방향으로 이동 가능 시 최대 채굴 금의 양 : "+answer);
*/
    }
}
