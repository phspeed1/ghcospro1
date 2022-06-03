package DP;

import java.util.Arrays;

public class No5_SoldierSideline_1 {

    // 15 11 4 8 5 2 4
    // 6  5  2 3 2 0 0

    private int dp(int[] arr){
        int answer = 0;
        int[] DT = new int[arr.length];

        return answer;
    }

    private int solution(int[] arr){
        int answer = 0;

        return answer;
    }

    public static void main(String[] args){
        No5_SoldierSideline_1 test = new No5_SoldierSideline_1();
        int[] arr = {15, 11, 4, 8, 5, 2, 4};
        System.out.println("병사의 전투력 배열 : "+Arrays.toString(arr));
        int answer = test.solution(arr);
        System.out.println("열외시켜야 하는 병사의 명수 : "+answer);
    }
}
