package DP;

import java.util.Arrays;

public class No1_DP_Ant_3 {

    private int solution(int[] arr){
        int answer = 0;
        int[] DT = new int[arr.length];

        DT[0] = arr[0];
        DT[1] = Math.max(arr[0], arr[1]);

        for(int i=2; i<arr.length; i++){
            DT[i] = Math.max(arr[i] + DT[i-2] , DT[i-1] );
        }
        answer = DT[arr.length -1];
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {3, 2, 1, 6, 4};
        System.out.println("입력값 : "+Arrays.toString(arr));
        int answer = new No1_DP_Ant_3().solution(arr);
        System.out.println("값 : "+answer);
    }
    
}
