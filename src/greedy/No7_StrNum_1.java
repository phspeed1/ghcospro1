package greedy;

import java.text.CharacterIterator;
import java.util.ArrayList;

public class No7_StrNum_1 {
    public static void main(String[] aStrings){
        String answer = "";
        String inStr = "K1KA5CB7";
        ArrayList<Character> strList = new ArrayList<Character>();
        int numSum = 0;

        for(int i=0; i<inStr.length(); i++){
            char c = inStr.charAt(i);
            if(c >= 'A' && c <= 'Z')
                strList.add(c);
            else
                numSum += c -'0';
        }
        java.util.Collections.sort(strList);
        for(char c : strList){
            answer += c;
        }
        answer += numSum;
        System.out.println(answer);

    }
}
