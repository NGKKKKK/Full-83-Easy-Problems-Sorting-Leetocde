
import java.util.Arrays;

// 217. Contains Duplicate

public class bai217 {
    
    //Solution
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; ++i) {
                if (nums[i + 1] == nums[i]) {
                    return true;
                }
            }
            return false;
        }
    }

}
