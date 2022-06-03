package sort;

import java.util.Arrays;

public class No2_BinerySearch_3 {

    private int binerySearch(int[] arr, int M, long start, long end){
        if(start > end)
            return -1;

        int answer = 0;

        while(start <= end){
            long mid = (start + end) / 2;
            long scm = 0;
            for(int i=0; i<arr.length; i++){
                scm += arr[i] - mid > 0 ? arr[i] - mid : 0;
            }
            System.out.println(start + "~" + mid + "~" + end +"("+scm+")");

            if(scm == M)
                return (int)mid;
            
            if(scm < M)
                end = mid -1;
            else{
                start = mid+1;
                answer = (int)mid;
            }
        }

        return answer;
    }
    private int solution(int[] arr, int M){
        int answer = 0;
        Arrays.sort(arr);

        int start = arr[0];
        int end = arr[arr.length -1];
        answer = binerySearch(arr, M, 0, end);
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {19, 14, 10, 17};
        int M = 7;
        System.out.println("각각의 떡 높이 arr : "+Arrays.toString(arr));
        int answer = new No2_BinerySearch_3().solution(arr, M);
        System.out.println(M+"을 자르기위한 절단기의 높이 answer : "+answer);

    }
}
