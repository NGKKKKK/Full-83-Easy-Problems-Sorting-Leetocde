
// 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum

public class bai2996 {

    //Solution
    class Solution {
        public int missingInteger(int[] nums) {
            
            int sum = 0;
            sum += nums[0];
            int indx = 1;
            
            while (indx < nums.length && nums[indx] == nums[indx - 1] + 1) {
                sum += nums[indx];
                indx++;
            }
            
            int res = sum;
            
            int max = 0;
            for (int val : nums) {
                if (val > max) max = val;
            }
            
            boolean[] exist = new boolean [max + 1];
            
            for (int val : nums) exist[val] = true;
            
            while (res <= max) {
                if (exist[res] == false) return res;
                res++;
            }
            
            return res;         
        }
    }
}
