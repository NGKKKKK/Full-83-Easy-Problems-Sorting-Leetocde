
import java.util.Arrays;

// 1637. Widest Vertical Area Between Two Points Containing No Points

public class bai1637 {

    //Solution
    class Solution {
        public int maxWidthOfVerticalArea(int[][] points) {
            
            int[] pos_x = new int [points.length];
            
            for (int i = 0; i < points.length; ++i) pos_x[i] = points[i][0];
            
            Arrays.sort(pos_x);
            
            int res = -1;
            for (int i = 0; i < points.length - 1; ++i) {
                int val = pos_x[i+1] - pos_x[i];
                res = Math.max(val, res);
            }
            return res;
        }
    }
}
