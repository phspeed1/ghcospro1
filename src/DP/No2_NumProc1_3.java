package DP;

import java.util.Arrays;

public class No2_NumProc1_3 {
    int[] DT;
    private int DP(int num){
        // /5, /3, /2, -1 중 하나의 연산.
        DT = new int[num+1];
        for(int i=2; i<=num; i++){
            DT[i] = DT[i-1] +1;
            if( i % 2 == 0)
                DT[i] = Math.min(DT[i], DT[i/2]+1);
            if( i % 3 == 0)
                DT[i] = Math.min(DT[i], DT[i/3]+1);
            if( i % 5 == 0)
                DT[i] = Math.min(DT[i], DT[i/5]+1);
        }
        System.out.println(Arrays.toString(DT));

        return DT[num];
    }

    private int solution(int num){
        int answer = 0;
        answer = DP(num);
        return answer;
    }

    public static void main(String[] args){
        int num = 26;
        System.out.println("입력값 num : "+num);
        int answer = new No2_NumProc1_3().solution(num);
        System.out.println("연산횟수 answer : "+answer);
    }
}
