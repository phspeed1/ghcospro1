package sort;

import java.util.Arrays;

public class No1_ArrTwoSwapSum_2 {

    private int solution(int N, int K, int[] A, int[] B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println("A : "+Arrays.toString(A));
        System.out.println("B : "+Arrays.toString(B));
        for(int i=0; i<N; i++){
            if(i<K && A[i] < B[N-1 -i]){
                System.out.println(A[i] + " <-> " + B[N-1 -i]);
                int temp = A[i];
                A[i] = B[N-1 -i];
                B[N-1 -i] = temp;
            }
            answer += A[i];
        }
        System.out.println("A : "+Arrays.toString(A));
        System.out.println("B : "+Arrays.toString(B));
        
        return answer;
    }

    public static void main(String[] aStrings){
        No1_ArrTwoSwapSum_2 test = new No1_ArrTwoSwapSum_2();
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
