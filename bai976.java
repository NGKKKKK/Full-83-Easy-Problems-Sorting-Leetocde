
import java.util.Arrays;

// 976. Largest Perimeter Triangle

public class bai976 {

    //Solution
    class Solution {
        public int largestPerimeter(int[] nums) {
            Arrays.sort(nums);
            int size = nums.length;
            
            for (int i = size - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
                }
            }
            return 0;
        }
    }
}
