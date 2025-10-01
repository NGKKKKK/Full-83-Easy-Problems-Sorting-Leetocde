
import java.util.Arrays;

// 169. Majority Element

public class bai169 {
    
    //Solution
    class Solution {
        public int majorityElement(int[] nums) {
            int bound = nums.length / 2;
            Arrays.sort(nums);
            int indx = 0;
            int count = 0;
            while (indx < nums.length) {
                count = 1;
                int i = indx;
                while (i < nums.length - 1) {
                    if (nums[i + 1] != nums[i]) {
                        break;
                    }
                    i++;
                    count++;
                }
                if (count > bound) {
                    return nums[indx];
                }
                indx = i + 1;
            }
            return -1;
        }
    }

}
