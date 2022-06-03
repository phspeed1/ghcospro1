package greedy;

import java.util.Scanner;

public class No6_Chass_1 {
    public static void main(String[] args){
        System.out.println("Knight 의 위치를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        System.out.println("INPUT : "+inp);

        int answer = 0;
        char x; // 1 ~ 8
        char y; // a ~ h
        if(inp.charAt(0) >= 'a' && inp.charAt(0) <= 'h'){
            y = inp.charAt(0);
            x = inp.charAt(1);
        }else{
            x = inp.charAt(0);
            y = inp.charAt(1);
        }

        int[][] move = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};
        for(int i=0; i<move.length; i++){
            char nx = (char) (x + move[i][0]);
            char ny = (char) (y + move[i][1]);
            if(nx >= '1' && nx <= '8' && ny >= 'a' && ny <= 'h'){
                answer++;
                System.out.println("가능 : "+nx+","+ny);
            }else{
                System.out.println("불가능 : "+nx+","+ny);
            }
        }
        System.out.println("answer : "+answer);

    }
}
