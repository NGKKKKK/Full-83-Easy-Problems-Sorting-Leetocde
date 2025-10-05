
import java.util.Arrays;

// 3194. Minimum Average of Smallest and Largest Elements

public class bai3194 {

    //Solution
    class Solution {
        public double minimumAverage(int[] nums) {
            
            Arrays.sort(nums);

            double res = Double.MAX_VALUE;
            int size = nums.length;
            int bound = size/2;

            for (int i = 0; i < bound; ++i) {
                double d = (nums[i] + nums[size-i-1])/2.0;
                res = Math.min(d, res);
            }

            return res;
        }
    }
}
