package graph;
import java.util.*;

public class No1_DFS_IceArray_6 {
    private int dfs(int[][] arr, int x, int y){
        if(x < 0|| y < 0 || x >= arr.length || y >= arr[x].length)
            return 0;
        if(arr[x][y] != 0)
            return 0;
        arr[x][y] = 1;
        dfs(arr, x-1, y);
        dfs(arr, x, y-1);
        dfs(arr, x+1, y);
        dfs(arr, x, y+1);
        return 1;
    }
    private int solution(int[][] arr){
        int answer = 0;

        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                answer += dfs(arr, i, j);
        print(arr);
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
        No1_DFS_IceArray_6 test = new No1_DFS_IceArray_6();
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
