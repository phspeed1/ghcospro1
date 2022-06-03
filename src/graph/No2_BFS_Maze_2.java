package graph;

import java.util.Arrays;
import java.util.Scanner;

public class No2_BFS_Maze_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("N 입력 엔터, M 입력 엔터");
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        System.out.println(N+" X "+M+" 0|1 입력 엔터");
        int[][] arr = new int[N][M];
        for(int i=0; i<N; i++){
            String str = sc.nextLine();
            for(int j=0; j<M && j<str.length(); j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        System.out.println("입력한 배열 : ");
        for(int[] i:arr){
            System.out.println(Arrays.toString(i));
        }
    }
    
}
