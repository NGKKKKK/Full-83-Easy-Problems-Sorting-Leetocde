
// 1913. Maximum Product Difference Between Two Pairs

public class bai1913 {

    //Solution
    class Solution {
        public int maxProductDifference(int[] nums) {
            int max_1 = Integer.MIN_VALUE;
            int max_2 = Integer.MIN_VALUE;
            int min_1 = Integer.MAX_VALUE;
            int min_2 = Integer.MAX_VALUE;
            
            for (int val : nums) {
                if (val > max_1) {
                    max_2 = max_1;
                    max_1 = val;
                }
                else if (val > max_2) {
                    max_2 = val;
                }
                
                if (val < min_1) {
                    min_2 = min_1;
                    min_1 = val;
                }
                else if (val < min_2) {
                    min_2 = val;
                }
            }
            return (max_1*max_2) - (min_1*min_2);
        }
    }
}
