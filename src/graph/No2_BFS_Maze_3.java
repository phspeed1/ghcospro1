package graph;

import java.util.Arrays;
import java.util.Scanner;

public class No2_BFS_Maze_3 {
    int resX;
    int resY;
    int ttt = 100;
    private void dfs(int[][] arr, int x, int y, int[][] res, int cost){
//        if(ttt-- < 0) return; // 테스트 
        if(x < 0 || y < 0 || x >= arr.length || y >= arr[x].length)
            return;
        if(arr[x][y] == 0)
            return;
        if(res[x][y] != 0 && res[x][y] <= cost)
            return;
        
        System.out.println("("+x+","+y+") "+cost);
        res[x][y] = cost;

        dfs(arr, x-1, y, res, cost+1);
        dfs(arr, x+1, y, res, cost+1);
        dfs(arr, x, y-1, res, cost+1);
        dfs(arr, x, y+1, res, cost+1);

    }

    private int solution(int[][] arr, int N, int M){
        int answer = 0;
        int[][] res = new int[N][M];
        resX = N -1;
        resY = M -1;
        dfs(arr, 0, 0, res, 1);
        printArr(res);
        answer = res[resX][resY];
        return answer;
    }
    public static void main(String[] args){
        int answer = 0;//1,1 부터 N,M 까지 밟은 노드 수 (1,1), (N,M) 포함
        int N = 5;
        int M = 6;
        // 1 : 이동가능, 0 : 이동불가(괴물)
        int[][] arr = {
              {1, 0, 1, 0, 1, 0}
            , {1, 1, 1, 1, 1, 1}
            , {0, 0, 0, 0, 0, 1}
            , {1, 1, 1, 1, 1, 1}
            , {1, 1, 1, 1, 1, 1}
        };
        No2_BFS_Maze_3 test = new No2_BFS_Maze_3();
        System.out.println("입력배열 : ");
        printArr(arr);
        answer = test.solution(arr, N, M);
//        System.out.println("결과배열 : ");
        System.out.println("밟은노드수 : "+answer);

    }

    private static void printArr(int[][] arr){
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }

    }
}
