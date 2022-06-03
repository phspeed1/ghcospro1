public class CalStock {

    public int solution(int[] prices){
        int answer = -1000001;
        int selVal =  1000001;
        for(int price : prices){
            if(selVal != 1000001)
                answer = Math.max(answer, price - selVal);
            selVal = Math.min(selVal, price);
        }

        return answer;
    }
    public static void main(String[] args) {
        CalStock calStock = new CalStock();
        int [] prices = {1,2,3};
        int answer = calStock.solution(prices);
        System.out.println("answer : "+answer);
        int[] prices2  = {3,1};
        answer = calStock.solution(prices2);
        System.out.println("answer : "+answer);
    }
}
