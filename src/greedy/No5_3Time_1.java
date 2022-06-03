package greedy;

public class No5_3Time_1 {
    public static void main(String[] args){
        int answer = 0;
        int N = 5;
        System.out.println("34 / 10 : "+(34/10));
        System.out.println("34 % 10 : "+(34%10));

        for(int hh = 0; hh<=N; hh++){
            for(int mm = 0; mm<=59; mm++){
                for(int ss = 0; ss<= 59; ss++){
                    String str = hh+""+mm+""+ss;
                    if(str.indexOf("3") != -1){
                        answer++;
                    }

                  //  if(hh % 10 == 3 || hh / 10 == 3 || mm % 10 == 3 || mm / 10 == 3 || ss % 10 == 3 || ss / 10 == 3){
                  //      answer++;
                  //  }
                }
            }
        }


        System.out.println("answer  "+answer);
    }
}
