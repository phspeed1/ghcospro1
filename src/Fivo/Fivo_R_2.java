package Fivo;

public class Fivo_R_2 {

    private long fivo(long[] arr, int num){
        if(num <= 1)
            return num;
        if(arr[num] != 0)
            return arr[num];
        return arr[num] = fivo(arr, num -1) + fivo(arr, num -2);
    }

    private long solution(int num){
        long answer = 0;
        long[] arr = new long[num+1];
        answer = fivo(arr, num);
        return answer;
    }
    public static void main(String[] args){
        Fivo_R_2 test = new Fivo_R_2();
        int num = 50;
        long answer = test.solution(num);
        System.out.println("피보나치 "+num+" : "+answer);
    }
    
}
