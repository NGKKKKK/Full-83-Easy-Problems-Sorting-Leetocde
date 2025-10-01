
// 645. Set Mismatch

public class bai645 {

    //Solution
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int n = nums.length;
            long current_sum_1 = 0;
            long current_sum_2 = 0;

            for (int d : nums) {
                current_sum_1 += d;
                current_sum_2 += (long)d*d;
            }

            long base_sum_1 = (long)n * (n+1) / 2;
            long base_sum_2 = (long)n * (n+1) * (2L*n+1) / 6;

            long x = base_sum_1 - current_sum_1;   
            long y = base_sum_2 - current_sum_2;   

            int missing = (int)((y/x + x) / 2);
            int duply   = (int)((y/x - x) / 2);

            return new int[]{duply, missing};
        }
    }
}
