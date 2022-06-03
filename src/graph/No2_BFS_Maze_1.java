package graph;

import java.util.Arrays;
import java.util.Scanner;

public class No2_BFS_Maze_1 {

    private void bfs(int[][] arr){

    }

    private int solution(int[][] arr){
        int answer = 0;
        int[][] inpArr = Arrays.copyOf(arr, arr.length);
        bfs(inpArr);
        System.out.println("결과배열 : ");
        printArr(arr);
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
        No2_BFS_Maze_1 test = new No2_BFS_Maze_1();
        System.out.println("입력배열 : ");
        printArr(arr);
        answer = test.solution(arr);
        System.out.println("밟은노드수 : "+answer);

    }

    private static void printArr(int[][] arr){
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }

    }
}
