package sort;

import java.util.Arrays;

public class No1_ArrTwoSwapSum_6 {
    
    private int binerySearch(int[] arr, int target, int start, int end, Counter count){
        if(start > end)
            return -1;
        
        int mid = (start+end)/2;

        System.out.println(start+"~"+end);

        if(arr[mid] == target)
            return mid;

        count.counter++;
        if(arr[mid] > target)
            return binerySearch(arr, target, start, mid-1, count);
        else
            return binerySearch(arr, target, mid+1, end, count);

    }
    class Counter{
        int counter;
        Counter(int counter){
            this.counter = counter;
        }
    }
    
    private int solution(int N, int K, int[] A, int[] B){
        int answer = 0;

        Arrays.sort(A);
        System.out.println("A : "+Arrays.toString(A));
        Counter count = new Counter(0);
        answer = binerySearch(A, 6, 0, A.length-1, count);
        System.out.println("count : "+count.counter);

        return answer;
    }
    public static void main(String[] aStrings){
        No1_ArrTwoSwapSum_6 test = new No1_ArrTwoSwapSum_6();
        int N = 10;
        int K = 4; // 3 회까지 바꿔치기 가능
        int[] A = {7, 6, 2, 5, 9, 0, 3, 4, 8, 1};
        int[] B = {5, 5, 6, 6, 5, 0, 3, 4, 8, 1};
//        System.out.println("B : "+Arrays.toString(B));
        int answer = test.solution(N, K, A, B);
        System.out.println(K+" 회 A<->B 변경가능 후 A원소의합계 최대값 : "+answer);
    }
}
