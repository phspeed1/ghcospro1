package greedy;

public class No1_2 {
    public static void main(String[] args){
        int n = 25;
        int k = 3;
        int result = 0;

        while(true){
            int target = ( n / k ) * k;
            result += (n - target);
            n = target;

            if(n < k)
                break;
            
            n /= k;
            result += 1;
        }

        result += n - 1;
        System.out.println("result : "+result);
    }
}
