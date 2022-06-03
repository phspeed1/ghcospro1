package greedy;

public class No1_1 {
    public static void main(String[] args){
        int n = 25;
        int k = 3;
        int result = 0;
        int target = 0;

        while(true){
            target = (n/k) * k;
            result += (n - target);
            n = target;

            if(n < k)
                break;
            result += 1;
            n /= k;
        }
        result += (n -1);
        System.out.println(result);

    }
}
