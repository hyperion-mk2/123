
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by hasee on 2018/9/18.
 */
public class new11 {
    public static final int MOD = 1000000007;
    public int knightDialer(int N) {
        int[][] graph = new int[][]{{4,6},{6,8},{7,9},{4,8},{3,9,0},{},{1,7,0},{2,6},{1,3},{2,4}};
        Integer[][] memory = new Integer[N+1][10];
        int cnt = 0;
        for(int i = 0;i<10;i++){
           cnt = cnt+(helper(N-1,i,graph,memory))% MOD;
        }
        return cnt;
    }
    private int helper(int n,int cur,int[][] graph,Integer[][] memory ){
        if (n == 0){
            return 1;
        }
        if(memory[n][cur] != null){
            return memory[n][cur];
        }
        int cnt = 0;
        for (int num : graph[cur]){
            cnt = cnt+(helper(n-1,num,graph,memory))% MOD;
        }
        memory[n][cur] = cnt;
        return cnt;
    }

    public static void main(String[] args) {
        new11 new1 = new new11();
        System.out.println(new1.knightDialer(4));

        }
    }
