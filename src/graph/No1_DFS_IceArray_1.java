package graph;
import java.util.*;

public class No1_DFS_IceArray_1 {

    private int solution(int[][] arr){
        int answer = 0;

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
        No1_DFS_IceArray_1 test = new No1_DFS_IceArray_1();
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
