package DP;

import java.util.Arrays;

public class No3_CoinSum_2 {

    private int dp(int[] coinTp, int num){
        int INF = 1000000000;
        Arrays.sort(coinTp);
        int minIdx = coinTp[0];

        int[] DT = new int[num+1];
        for(int i=0; i< DT.length; i++)
            DT[i] = INF;
            
        for(int i=minIdx; i<= num; i++){

            int min = INF;
            for(int coin : coinTp){
                if(i==coin)
                    min = 1;
                else if(i-coin >= 0)
                    min = Math.min(min, DT[i-coin] +1);
            }
            DT[i] = min;
        }


        System.out.println("DT : "+Arrays.toString(DT));
        return DT[num] != INF ? DT[num]: -1;
    }

    private int solution(int[] coinTp, int num){
        int answer = 0;
        answer = dp(coinTp, num);
        return answer;
    }

    public static void main(String[] args){
        int N = 2;
        int M = 4;
        int[] coinTp = {5, 3, 7};
        System.out.println("목표금액 : "+M+", 코인종류 : "+Arrays.toString(coinTp)+", 필요한 최소 동전개수는 ?");
        int answer = new No3_CoinSum_2().solution(coinTp, M);
        System.out.println("answer : "+answer);
    }
}
