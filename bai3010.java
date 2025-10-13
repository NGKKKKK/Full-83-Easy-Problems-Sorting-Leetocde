
// 3010. Divide an Array Into Subarrays With Minimum Cost I

public class bai3010 {

    //Solution
    class Solution {
        public int minimumCost(int[] nums) {
            //sort
            int size = nums.length;
            int res = nums[0];
            int minFirst = 0;
            int minSecond = 0;
            for (int i = 1; i < size; ++i) {
                int val = nums[i];
                if (val < minFirst) {
                    minSecond = minFirst;
                    minFirst = val;
                }
                else if (val < minSecond) {
                    minSecond = val;
                }
            }
            res += (minFirst + minSecond);
            return res;
        }
    }
}
