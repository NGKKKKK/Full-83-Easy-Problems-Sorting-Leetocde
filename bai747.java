
// 747. Largest Number At Least Twice of Others

public class bai747 {

    //Solution
    class Solution {
        public int dominantIndex(int[] nums) {
            int indx = -1;
            int max = Integer.MIN_VALUE;
            
            for (int i = 0; i < nums.length; ++i) {
                if (max < nums[i]) {
                    indx = i;
                    max = nums[i];
                }
            }
            
            for (int d : nums) {
                if (d == max) continue;
                if (d > (max/2)) return -1;
            }
            return indx;
        }
    }
}
