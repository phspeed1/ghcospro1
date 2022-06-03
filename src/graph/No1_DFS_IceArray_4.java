package graph;
import java.util.*;

public class No1_DFS_IceArray_4 {

    private void dfs(int[][] arr, int x, int y, int mark){
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        arr[x][y] = mark;
        for(int i=0; i<dx.length; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[nx].length && arr[nx][ny] == 0)
                dfs(arr, nx, ny, mark);
        }
    }
    private int solution(int[][] arr){
        int answer = 0;
        answer = 2;
        for(int x = 0; x < arr.length; x++){
            for(int y = 0; y< arr[x].length; y++){
                if(arr[x][y]== 0){
                    dfs(arr, x, y, answer++);
                }
            }
        }
        print(arr);
        answer -= 2;

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
        No1_DFS_IceArray_4 test = new No1_DFS_IceArray_4();
        int answer = test.solution(arr);
        System.out.println("얼음빙판에서 얻을 수 있는 총 얼음덩어리 수 : "+answer);

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
