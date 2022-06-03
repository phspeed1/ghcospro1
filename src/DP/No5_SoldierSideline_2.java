package DP;

import java.util.Arrays;

public class No5_SoldierSideline_2 {

    // 15 11 4 8 5 2 4
    // 6  5  2 3 2 0 0
    private void swap(int[] arr, int i1, int i2){
        int v1 = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = v1;
    }
    private int dp(int[] arr){
        int answer = 0;
        // 가장 긴 증가하는 부분수열 찾기

        // arr 배열 reverse 해서 증가하도록 변경
        for(int i=0; i<arr.length/2; i++){
            swap(arr, i, arr.length -1 -i);
        }
        System.out.println("리버스 : "+Arrays.toString(arr));

        int[] DT = new int[arr.length];
        Arrays.fill(DT, 1);

        for(int i=1; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i])
                    DT[i] = Math.max(DT[i], DT[j]+1);
            }
        }
        System.out.println("DT : "+Arrays.toString(DT));
        
        int LIS = 1;
        for(int i : DT)
            LIS = Math.max(LIS, i);

        answer = arr.length - LIS;
        System.out.println("가장긴 증가하는 부분수열 의 원소 수 LIS : "+LIS);

        return answer;
    }

    private int solution(int[] arr){
        int answer = 0;
        answer = dp(arr);
        return answer;
    }

    public static void main(String[] args){
        No5_SoldierSideline_2 test = new No5_SoldierSideline_2();
        int[] arr = {15, 11, 4, 8, 5, 2, 4};
        System.out.println("병사의 전투력 배열 : "+Arrays.toString(arr));
        int answer = test.solution(arr);
        System.out.println("열외시켜야 하는 병사의 명수 : "+answer);
    }
}
