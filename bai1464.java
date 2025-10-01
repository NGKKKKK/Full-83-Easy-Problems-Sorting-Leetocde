
// 1464. Maximum Product of Two Elements in an Array

public class bai1464 {
    
    //Solution
    class Solution {
        public int maxProduct(int[] nums) {
            int[] arr = new int [nums.length];
            
            for (int i = 0; i < nums.length; ++i) arr[i] = nums[i] - 1;
            
            int max1, max2;
            max1 = max2 = Integer.MIN_VALUE;
            
            for (int val : arr) {
                if (val > max1) {
                    max2 = max1;
                    max1 = val;
                }
                else if (val > max2) {
                    max2 = val;
                }
            }
            return max1*max2;
        }
    }
}
