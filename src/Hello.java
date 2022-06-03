import java.util.ArrayList;
import java.util.Arrays;

public class Hello{
    public static void main(String args[]){
        System.out.println("Hello World");
        int answer = 0;
        int num = 100;
        int ttt = 10000;
        int start = 0; int end = 0;
/*        
        System.out.println(Math.sqrt(9));

        // 소수 구하기 제곱근까지만 활용
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=2; i<=num; i++){
            boolean isSosu = true;
            for(int j=2; j<= Math.sqrt(i); j++){
                if(i%j==0){
                    isSosu = false;
                    break;
                }
            }
            if(isSosu) list.add(i);
        }
        System.out.println(num + " 이하의 모든 소수 : "+list);

        // 소수 구하기 에스토네스의 체
        boolean[] arrSosu = new boolean[num+1];
        Arrays.fill(arrSosu, true);

        for(int i=2; i<= Math.sqrt(num); i++){
            if(arrSosu[i]){
                int j=2;
                while(i*j <arrSosu.length){
                    arrSosu[i*j] = false;
                    j++;
                }
            }
        }

        list.clear();
        for(int i=2; i<=num; i++){
            if(arrSosu[i]) list.add(i);
        }
        System.out.println(num + " 이하의 모든 소수 : "+list);
*/
/*
        int M = 5;
        int[] arr = {1, 4, 1, 4};
        start = 0;
        end = 0;
        ttt = 10000;
        answer = 0;
        
        
        
        while(start<arr.length && end<arr.length){
            if(ttt-- < -1)return;
            int subSum = 0;
            for(int i=start; i<=end; i++){
                subSum += arr[i];
            }
            if(subSum == M){
                answer++;System.out.println(arr[start]+"~"+arr[end]);
                start++;
            }else if(subSum < M){
                end++;
            }else{
                start++;
            }
        }
        System.out.println("부분합이 "+M+" 인 모든 경우의 수 : "+answer);

        answer = 0;
        start = 0; end=0;
        int interval_sum = 0;
        for(start=0; start<arr.length; start++){
            while(interval_sum < M && end < arr.length){
                interval_sum += arr[end++];
            }
            if(interval_sum == M){
                answer++;System.out.println(arr[start]+"~"+arr[end-1]);
            }
            interval_sum -= arr[start];
        }
        
        System.out.println("부분합이 "+M+" 인 모든 경우의 수 : "+answer);
*/
        int[] arr = {10, 20, 30, 40, 50};
        int[] preSum = new int[arr.length+1];
        int subSum = 0;
        for(int i=0; i<arr.length; i++){
            preSum[i+1] = subSum += arr[i];
        }
        int left = 2;
        int right = 5;
        System.out.println(left+"~"+right+" 의 subsum : "+(preSum[right] - preSum[left-1]));

        System.out.println(left+"~"+right+" 의 subsum : "+(preSum[right] - preSum[left-1]));

    }
}