import java.util.List;

/**
 * Created by hasee on 2018/11/15.
 */
public class singleNumber {
    public int singleNumber(int[] nums) {
        int elem = 0;
        for(int index:nums){
            elem = elem ^ index;
        }
        return elem;
    }

    public static void main(String[] args) {
        singleNumber singlenumber = new singleNumber();
        int[] i = {2,3,2,3,1};
        System.out.println(singlenumber.singleNumber(i));
    }
}
