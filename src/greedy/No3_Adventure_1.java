package greedy;
import java.util.*;


public class No3_Adventure_1 {
    public static void main(String[] args){
        int[] nums = {2, 3, 1, 2, 2};
        int answer = 0;

        java.util.Arrays.sort(nums);

        int cnt = 0;
        for(int i : nums){
            cnt++;
            if(cnt >= i){
                answer++;
                cnt=0;
            }
        }
/*        
        int i = 0;
        int needs = 0;
        int manCnt = 0;
        // {1, 2, 2, 2, 3}
        while(i < nums.length){
            int num = nums[i];
            needs = Math.max(needs, num);
            manCnt++;
            if(needs <= manCnt){
                answer++;
                needs = 0;
                manCnt = 0;
            }
            i++;
        }
*/
        System.out.println("answer : "+answer);



    }
    
}
