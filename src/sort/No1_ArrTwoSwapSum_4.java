package sort;

import java.util.Arrays;

public class No1_ArrTwoSwapSum_4 {

    private void quickSort(int[] arr, int start, int end) {
        if(start >= end) return;
        int pivot = start;
        int left = start+1;
        int right = end;

        while(left <= right){
            while(left <= end && arr[left] <= arr[pivot]) left++;
            while(right > start && arr[right] >= arr[pivot]) right--;
            if(left > right)
                swap(arr, pivot, right);
            else
                swap(arr, left, right);
        }
     //   System.out.println(start+"~"+end +" "+Arrays.toString(arr));

        quickSort(arr, start, right -1);
        quickSort(arr, right +1, end);
}
    private void swap(int[] arr, int i1, int i2){
        int v1 = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = v1;
    }

    private int solution(int N, int K, int[] A, int[] B){
        int answer = 0;

        quickSort(A, 0, A.length-1);
        quickSort(B, 0, B.length-1);
        System.out.println("정렬 후 A : "+Arrays.toString(A));
        System.out.println("정렬 후 B : "+Arrays.toString(B));

        return answer;
    }

    public static void main(String[] aStrings){
        No1_ArrTwoSwapSum_4 test = new No1_ArrTwoSwapSum_4();
        int N = 5;
        int K = 3; // 3 회까지 바꿔치기 가능
        int[] A = {7, 6, 2, 5, 9, 0, 3, 4, 8, 1};
        int[] B = {5, 5, 6, 6, 5, 0, 3, 4, 8, 1};
        System.out.println("A : "+Arrays.toString(A));
        System.out.println("B : "+Arrays.toString(B));
        int answer = test.solution(N, K, A, B);
        System.out.println(K+" 회 A<->B 변경가능 후 A원소의합계 최대값 : "+answer);
        

    }
}
