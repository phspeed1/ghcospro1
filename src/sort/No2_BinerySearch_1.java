package sort;

import java.util.Arrays;

public class No2_BinerySearch_1 {
    private int solution(int[] arr, int M){
        int answer = 0;
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {19, 14, 10, 17};
        int M = 6;
        System.out.println("각각의 떡 높이 arr : "+Arrays.toString(arr));
        int answer = new No2_BinerySearch_1().solution(arr, M);
        System.out.println(M+"을 자르기위한 절단기의 높이 answer : "+answer);

    }
}
