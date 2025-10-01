
// 268. Missing Number

public class bai268 {
    
    //Solution
    class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            long base_sum = (n*(n+1))/2;
            long current_sum = 0;
            for (int d : nums) {
                current_sum += d;
            }
            return (int) (base_sum - current_sum);
        }
    }
}
