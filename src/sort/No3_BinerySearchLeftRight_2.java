package sort;

import java.util.Arrays;

public class No3_BinerySearchLeftRight_2 {
    int ttt = 10000;

    private int bisectLR(int[] arr, int M, int start, int end, boolean findLeft){
        int answer = -1;

        while(start <= end && start >=0 && end < arr.length){
            int mid = (start + end)/2;
            if(arr[mid] == M){
                answer = mid;
                if(findLeft){
                    start = 0;
                    end = mid-1;
                }else{
                    start = mid+1;
                    end = arr.length -1;
                }
            }else if(M < arr[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }

        return answer;
    }
    
    private int solution(int[] arr, int M){
        int answer = 0;
        Arrays.sort(arr);

        int minIdx = bisectLR(arr, M, 0, arr.length-1, true);
        System.out.println("minIdx : "+minIdx);
        int maxIdx = bisectLR(arr, M, 0, arr.length-1, false);
        System.out.println("maxIdx : "+maxIdx);
        answer = count(minIdx, maxIdx);
        return answer;
    }

    private int count(int minIdx, int maxIdx){
        int r=0;
        for(int i=minIdx; i<=maxIdx; i++) r++;
        return r;
    }
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 5, 5};
        int M = 3;
        System.out.println("arr : "+Arrays.toString(arr));
        int answer = new No3_BinerySearchLeftRight_2().solution(arr, M);
        System.out.println(M+"이 등장하는 횟수 answer : "+answer);

    }
}
