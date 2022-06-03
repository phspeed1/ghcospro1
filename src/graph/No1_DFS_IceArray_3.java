package graph;
import java.util.*;

public class No1_DFS_IceArray_3 {

    private int[][] dfs(int[][] arr, int[][] res, int x, int y, int mark){

//        System.out.println("마크 전 ["+mark+"]"+x+","+y+" value : "+arr[x][y]);

        res[x][y] = mark;
        int dx[] = {-1, 0, 1, 0};
        int dy[] = { 0,-1, 0, 1};

        for(int i=0; i<dx.length; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[nx].length){
                if(arr[nx][ny] != 1 && res[nx][ny] == 0){
                    dfs(arr, res, nx, ny, mark);
                }
            }
        }
        return arr;
    }
    
    private int solution(int[][] arr){
        int answer = 0;
        int mark = 1;
        int[][] res = new int[arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] != 1 && res[i][j] == 0){
//                System.out.println("마크 전 ["+mark+"]"+i+","+j+" value : "+arr[i][j]);
                dfs(arr, res, i, j, mark++);
                }
            }
        }
        print(res);
        answer = mark -1;
        return answer;
    }
    public static void main(String[] args){
        int[][] arr = {
              {0, 0, 1, 1, 0}
            , {0, 0, 0, 1, 1}
            , {1, 1, 1, 1, 1}
            , {0, 0, 0, 0, 0}
        };
        System.out.println("얼음빙판배열 : ");
        print(arr);
        No1_DFS_IceArray_3 test = new No1_DFS_IceArray_3();
        int answer = test.solution(arr);
        System.out.println("얼음빙판에서 얻을 수 있는 총 얼음덩어리 수 : "+answer);
  //      print(arr);

    }    
    public static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)
                System.out.print("["+arr[i][j]+"]");
            System.out.println();
        }
        System.out.println();
    }
}
