
import java.util.Arrays;

// 1005. Maximize Sum Of Array After K Negations

public class bai1005 {

    //Solution
    class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
            int size = nums.length;
            int res = 0;
            
            Arrays.sort(nums);
            
            for (int i = 0; i < size && k > 0; i++) {
                if (nums[i] < 0) {
                    nums[i] = -nums[i];
                    k--;
                }
            }
            
            Arrays.sort(nums);
            
            if (k % 2 == 1) {
                nums[0] = -nums[0];
            }

            for (int num : nums) {
                res += num;
            }
            
            return res;            
        }
    }
}
