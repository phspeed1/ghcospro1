package DP;

import java.util.Arrays;

public class No3_CoinSum_1 {

    private void dp(){

    }

    private int solution(int[] coinTp, int num){
        int answer = 0;
        // 
        return answer;
    }

    public static void main(String[] args){
        int N = 2;
        int M = 15;
        int[] coinTp = {2, 3};
        System.out.println("목표금액 : "+M+", 코인종류 : "+Arrays.toString(coinTp)+", 필요한 최소 동전개수는 ?");
        int answer = new No3_CoinSum_1().solution(coinTp, M);
        System.out.println("answer : "+answer);
    }
}
