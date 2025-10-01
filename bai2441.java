
// 2441. Largest Positive Integer That Exists With Its Negative

public class bai2441 {

    //Solution
    class Solution {
        public int findMaxK(int[] nums) {

            int max = Integer.MIN_VALUE;
            
            for (int val : nums) {
                if (val > max) max = val;
            }
            
            if (max <= 0) return -1;
            
            boolean[][] isExist = new boolean [max + 1][2]; // k and -k
            
            for (int val : nums) {
                if (val > 0) isExist[val][0] = true;
                else {
                    if (val < -1*max) continue;
                    isExist[-1*val][1] = true;
                }
            }
            
            int res = max;
            
            while (res > 0) {
                if (isExist[res][0] == true && isExist[res][1] == true) return res;
                res--;
            }
            
            return -1;
        }
    }
}
