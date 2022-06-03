package DP;

import java.util.Arrays;

public class No1_DP_Ant_2 {

    int ttt = 100;
    private int dp(int[] arr, int idx){
        if(ttt-- < -1) return 0;
        if(idx < 0 || idx >= arr.length)
            return 0;
        return Math.max(arr[idx] + dp(arr, idx-2), dp(arr, idx-1));

    }

    private int solution(int[] arr){
        int answer = 0;
        answer = dp(arr, arr.length -1);
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {3, 2, 1, 6, 4};
        System.out.println("입력값 : "+Arrays.toString(arr));
        int answer = new No1_DP_Ant_2().solution(arr);
        System.out.println("값 : "+answer);
    }
    
}
