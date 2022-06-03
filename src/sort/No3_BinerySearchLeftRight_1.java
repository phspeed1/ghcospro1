package sort;

import java.util.Arrays;

public class No3_BinerySearchLeftRight_1 {
    int ttt = 10000;

    private int solution(int[] arr, int M){
        int answer = 0;
        return answer;
    }
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 5, 5};
        int M = 3;
        System.out.println("arr : "+Arrays.toString(arr));
        int answer = new No3_BinerySearchLeftRight_1().solution(arr, M);
        System.out.println(M+"이 등장하는 횟수 answer : "+answer);

    }
}
