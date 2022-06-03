package DP;

import java.util.Arrays;

public class No3_CoinSum_4 {

    private int dp(int[] coinTp, int num){
        int INF = 1000000000;
        int[] DT = new int[num+1];
        Arrays.fill(DT, INF);
        DT[0] = 0;

        for(int coin : coinTp){
            for(int i=coin; i<=num; i++){
                DT[i] = Math.min(DT[i], DT[i - coin]+1);
            }
            System.out.println("[" +coin+ "]"+Arrays.toString(DT));
        }

        return DT[num] == INF ? -1 : DT[num];
    }

    private int solution(int[] coinTp, int num){
        int answer = 0;
        answer = dp(coinTp, num);
        return answer;
    }

    public static void main(String[] args){
        int N = 2;
        int M = 8;
        int[] coinTp = {7, 5, 2};
        System.out.println("목표금액 : "+M+", 코인종류 : "+Arrays.toString(coinTp)+", 필요한 최소 동전개수는 ?");
        int answer = new No3_CoinSum_4().solution(coinTp, M);
        System.out.println("answer : "+answer);
    }
}
