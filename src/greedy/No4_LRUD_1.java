package greedy;
import java.util.Arrays;

public class No4_LRUD_1 {
    public static void main(String[] args){
        int N = 5;
        int[] pos = {1,1};
        int[] npos = pos;
        String plan = "RRRUDD";
        int[][] dp = {{0,-1}, {0, 1}, {-1, 0}, {1, 0}};
        char[] ds = {'L', 'R', 'U', 'D'};

        for(int i=0; i<plan.length(); i++){
            char go = plan.charAt(i);
            npos = Arrays.copyOf(pos, pos.length);
            System.out.println(pos[0]+","+pos[1]+" : "+go);
            for(int j=0; j<ds.length; j++){
                if(go == ds[j]){
                    boolean canGo = true;
                    for(int k=0; k<npos.length; k++){
                        npos[k] += dp[j][k];
                        if(npos[k] < 1 || npos[k] > N)
                            canGo = false;
                    }
                    System.out.println(npos[0]+","+npos[1]+" : "+canGo);
                    if(canGo){
                        pos = Arrays.copyOf(npos, npos.length);
                    }else{
                        npos = Arrays.copyOf(pos, pos.length);
                    }
                }
            }
        }
        System.out.println(Arrays.toString(pos));

    }
    
}
