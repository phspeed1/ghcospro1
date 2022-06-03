package greedy;

public class No2_MultiSum_1 {
    
    public static void main(String[] args){
        String str = "02984";
        int result = 0;

        for(int i=0; i<str.length(); i++){

            int num = Integer.parseInt(str.substring(i, i+1));
/*
            if(result * num > result + num)
                result *= num;
            else
                result += num;
*/
            if(result <= 1 || num <= 1 )
                result += num;
            else
                result *= num;                
        }
        System.out.println("result : "+result);
    }
}
