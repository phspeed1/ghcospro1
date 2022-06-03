package DP;

import java.util.Arrays;

public class No4_GoldMine_1 {

    private void dp(){

    }

    private int solution(int[][] arr, int start){
        int answer = 0;
        int x = start -1;
        int y = 0;
        dp();
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
        answer = new No4_GoldMine_1().solution(arr, start);
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
        answer = new No4_GoldMine_1().solution(arr2, start);
        System.out.println("우3방향으로 이동 가능 시 최대 채굴 금의 양 : "+answer);

    }
}
