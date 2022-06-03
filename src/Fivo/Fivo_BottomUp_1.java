package Fivo;

public class Fivo_BottomUp_1 {


    private long solution(int num){
        long answer = 0;
        long n2=0;
        long n1=1;
        long R=n1;
        for(int i=2; i<=num; i++){
            answer = n1 + n2;
            R = n1;
            n1 = answer;
            n2 = R;
        }

        return answer;
    }
    public static void main(String[] args){
        Fivo_BottomUp_1 test = new Fivo_BottomUp_1();
        int num = 50;
        long answer = test.solution(num);
        System.out.println("피보나치 "+num+" : "+answer);
    }
    
}
