/**
 * Created by hasee on 2018/11/13.
 */
public class depth {
    public int findPeakElement(int[] nums) {
        int length = nums.length;
        int dlength = 0;
        int num = nums.length / 2;
        if (length == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[length - 1] > nums[length - 2]) {
            return length - 1;
        }
        while (true) {

            if (nums[num + 1] < nums[num] && nums[num] > nums[num - 1]) {
                return num;
            }
            if (nums[num + 1] >= nums[num - 1]) {
                dlength = num;
                num += (length - num) / 2;
            } else {
                length = num;
                num -= (num - dlength) / 2;
            }
        }
    }

    public static void main(String[] args) {
        depth depth = new depth();
        int[] nums = {2,3,4,3,2,1};
        System.out.println(depth.findPeakElement(nums));
    }
}
