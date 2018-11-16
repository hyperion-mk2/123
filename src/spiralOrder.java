import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2018/11/15.
 */
public class spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = matrix.length;
        int length = matrix[0].length;
        int down = 0;
        int left = 0;
        List<Integer> result = new ArrayList<Integer>();
        while (top != down&&left!=length){
        //while (down == left) {
            for (int j = left; j < length; j++) {
                result.add(matrix[down][j]);
            }
            down = down + 1;
            if (down==top||left==length){
                return result;
            }
            for (int h = down; h < top; h++) {
                result.add(matrix[h][length - 1]);
            }
            length = length - 1;
            if (down==top||left==length){
                return result;
            }
            for (int h = length - 1; h >= left; h--) {
                result.add(matrix[top - 1][h]);
            }
            top = top - 1;
            if (down==top||left==length){
                return result;
            }
            for (int h = top - 1;h >= down;h--)
            {
                result.add(matrix[h][left]);
            }
            left = left + 1;
            if (down==top||left==length){
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[][] martix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] martix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        spiralOrder spiralOrder = new spiralOrder();
        System.out.println(spiralOrder.spiralOrder(martix));
    }
}
