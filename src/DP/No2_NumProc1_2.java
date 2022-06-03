package DP;

public class No2_NumProc1_2 {
    int ttt = 10000;
    private int DP(int num, int cnt, String debg){
        if(num==1)
        System.out.println("num : "+num+", cnt : "+cnt+" <- "+debg);
        if(ttt-- < -1) return -1;
        if(num == 1)
            return cnt;
        if(num == 2)
            return DP(num-1, cnt+1, debg+"-1");

        if(num % 5 ==0)
            return Math.min(DP(num/5, cnt+1, debg+"/5"), DP(num-1, cnt+1, debg+"-1"));
        if(num % 3 ==0)
            return Math.min(DP(num/3, cnt+1, debg+"/3"), DP(num-1, cnt+1, debg+"-1"));
        if(num % 2 ==0)
            return Math.min(DP(num/2, cnt+1, debg+"/3"), DP(num-1, cnt+1, debg+"-1"));

        return DP(num-1, cnt+1, debg+"-1");

    }

    private int solution(int num){
        int answer = 0;
        answer = DP(num, 0, "");
        return answer;
    }

    public static void main(String[] args){
        int num = 37;
        System.out.println("입력값 num : "+num);
        int answer = new No2_NumProc1_2().solution(num);
        System.out.println("연산횟수 answer : "+answer);
    }
}
