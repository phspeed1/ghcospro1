package DP;

import java.util.Arrays;

public class No3_CoinSum_3 {
    int INF = 100000000;
    int ttt = 100000;
    private int dp(int[] coinTp, int target, int num, int cnt){
        System.out.println(cnt + " : "+ num);
        if(ttt-- < -1) return INF;
        if(num == target)
            return cnt;
        if(num > target)
            return INF;
        
        int min = INF;

        for(int coin : coinTp)
            min = Math.min(min, dp(coinTp, target, num+coin, cnt+1));
        
        return min;
    }

    private int solution(int[] coinTp, int num){
        int answer = 0;
        answer = dp(coinTp, num, 0, 0);
        return answer != INF ? answer : -1;
    }

    public static void main(String[] args){
        int N = 2;
        int M = 4;
        int[] coinTp = {3, 5, 7};
        System.out.println("목표금액 : "+M+", 코인종류 : "+Arrays.toString(coinTp)+", 필요한 최소 동전개수는 ?");
        int answer = new No3_CoinSum_3().solution(coinTp, M);
        System.out.println("answer : "+answer);
    }
}
