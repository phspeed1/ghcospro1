package sort;

import java.util.Arrays;

public class No3_BinerySearch_1 {
    int ttt = 10000;
    private int binerySearch(int[] arr, int M, int start, int end){
        return binerySearch(arr, M, start, end, true);
    }
    private int binerySearch(int[] arr, int M, int start, int end, boolean bisectLeft){
        if(start > end)
            return -1;

        int answer = -1;

        while(start <= end && start >=0 && end < arr.length){
            if(ttt-- < -1) return -1;
            int mid = (start + end) / 2;
            System.out.print(start + "~" + mid + "~" + end);
            System.out.println("("+arr[mid]+")");

            if(arr[mid] == M){
                answer = mid;
                if(bisectLeft){
                    start = 0;
                    end = mid-1;
                }else{
                    start = mid +1;
                    end = arr.length-1;
                }
            }else if(arr[mid] > M)
                end = mid -1;
            else{
                start = mid+1;
            }
        }

        return answer;
    }
    private int solution(int[] arr, int M){
        int answer = 0;
        Arrays.sort(arr);

        int start = arr[0];
        int end = arr.length-1;
        int minIdx = binerySearch(arr, M, 0, end);
        System.out.println("minIdx : "+minIdx);
        int maxIdx = binerySearch(arr, M, 0, end, false);
        System.out.println("maxIdx : "+maxIdx);
        answer = maxIdx - minIdx;
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 5, 5};
        int M = 3;
        System.out.println("arr : "+Arrays.toString(arr));
        int answer = new No3_BinerySearch_1().solution(arr, M);
        System.out.println(M+"이 등장하는 횟수 answer : "+answer);

    }
}
