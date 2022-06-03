package sort;

import java.util.Arrays;

public class No1_ArrTwoSwapSum_3 {

    private void quickSort(int[] arr, int start, int end){
        if(start >= end) return;
        int pivot = start;
        int left = start +1;
        int right = end;
        while(left <= right){
            while(left <=end && arr[left] <= arr[pivot] ) left++;
            while(right > start && arr[right] >= arr[pivot]) right--;
            if(left > right){
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right]= temp;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            quickSort(arr, start, right -1);
            quickSort(arr, right + 1, end);

        }
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
        No1_ArrTwoSwapSum_3 test = new No1_ArrTwoSwapSum_3();
        int N = 5;
        int K = 3; // 3 회까지 바꿔치기 가능
        int[] A = {1, 2, 5, 4, 3};
        int[] B = {5, 5, 6, 6, 5};
        System.out.println("A : "+Arrays.toString(A));
        System.out.println("B : "+Arrays.toString(B));
        int answer = test.solution(N, K, A, B);
        System.out.println(K+" 회 A<->B 변경가능 후 A원소의합계 최대값 : "+answer);
        

    }
}
