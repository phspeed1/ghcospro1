package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No2_BFS_Maze_5 {

    class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    private void bfs(int[][] arr){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(0, 0));
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        int ttt = 100;
        while(!queue.isEmpty()){
            if(ttt-- < 0)return;
            Node node = queue.poll();
            for(int i=0; i<dx.length; i++){
                int x = node.x + dx[i];
                int y = node.y + dy[i];

                if(x < 0 || y < 0 || x >= arr.length || y >= arr[x].length)
                    continue;
                if(arr[x][y] != 1)
                    continue;
                arr[x][y] = arr[node.x][node.y] +1;
                queue.add(new Node(x, y));
                
            }
        }
    }

    private int solution(int[][] arr, int N, int M){
        int answer = 0;
        bfs(arr);
        System.out.println("결과배열 : ");
        printArr(arr);
        answer = arr[N-1][M-1];
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
        No2_BFS_Maze_5 test = new No2_BFS_Maze_5();
        System.out.println("입력배열 : ");
        printArr(arr);
        answer = test.solution(arr, N, M);
        System.out.println("밟은노드수 : "+answer);

    }

    private static void printArr(int[][] arr){
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }

    }
}
