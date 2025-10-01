
import java.util.Arrays;

// 1984. Minimum Difference Between Highest and Lowest of K Scores

public class bai1984 {
    
    //Solution
    class Solution {
        public int minimumDifference(int[] nums, int k) {

            if (k == 1) return 0;
            
            Arrays.sort(nums);
            
            int n = nums.length;
            int res = Integer.MAX_VALUE;
            
            for (int i = 0; i < (n - k + 1); ++i) {
                res = Math.min(res, nums[i + k - 1] - nums[i]);
            }
            
            return res;
        }
    }
}
