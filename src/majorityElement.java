/**
 * Created by hasee on 2018/11/16.
 */
public class majorityElement {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int returndata = 0;
        if(len == 1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] != nums[j]&&nums[j]!=0) {
                        nums[i] = 0;
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0;i<nums.length;i++){
            if (nums[i]!=0){
                returndata = nums[i];
                break;
            }
        }
        return returndata;
    }

    public static void main(String[] args) {
        majorityElement majorityElement = new majorityElement();
        int[] nums = {3,3,4};
        System.out.println(majorityElement.majorityElement(nums));
    }
}
