package sort;

import java.util.Arrays;

public class No1_ArrTwoSwapSum_7 {
    
    private int binerySearch(int[] arr, int target, int start, int end){

        int answer = 0;

        int mid=0;
        while(start <= end){
            mid = (start+end)/2;
            if(arr[mid] == target)
                start = end = mid;
            else if(arr[mid] > target)
                end = mid-1;
            else
                start = mid+1;
        }
        answer = mid;
        return answer;
    }
    
    private int solution(int N, int K, int[] A, int[] B){
        int answer = 0;

        Arrays.sort(A);
        System.out.println("A : "+Arrays.toString(A));
        answer = binerySearch(A, 6, 0, A.length-1);

        return answer;
    }
    public static void main(String[] aStrings){
        No1_ArrTwoSwapSum_7 test = new No1_ArrTwoSwapSum_7();
        int N = 10;
        int K = 4; // 3 회까지 바꿔치기 가능
        int[] A = {7, 6, 2, 5, 9, 0, 3, 4, 8, 1};
        int[] B = {5, 5, 6, 6, 5, 0, 3, 4, 8, 1};
//        System.out.println("B : "+Arrays.toString(B));
        int answer = test.solution(N, K, A, B);
        System.out.println(K+" 회 A<->B 변경가능 후 A원소의합계 최대값 : "+answer);
    }
}
