import java.util.ArrayList;
import java.util.List;


/**
 * Created by hasee on 2018/11/7.
 */
public class Numbers_of_island {
    public List<String> generateParenthesis(int n) {
        List<String> list2 = new ArrayList<String>();
        dfs("",2*n,0,0,list2);
        return list2;
    }
    private void dfs(String list,int n,int leftnum,int m, List<String> list2){
        if (n == m){
            list2.add(list);
        }
        else if(leftnum == 0) {
            dfs(list + '(', n, leftnum + 1, m + 1,list2);
        }
        else if(n-m == leftnum){
            dfs(list + ')', n,leftnum - 1, m + 1,list2);
        }
        else{
            dfs(list + '(', n, leftnum + 1, m + 1,list2);
            dfs(list + ')', n, leftnum - 1, m + 1,list2);
        }
    }
    public static void main(String[] args) {
        Numbers_of_island numbers_of_island = new Numbers_of_island();
        System.out.println(numbers_of_island.generateParenthesis(3));
    }
}


