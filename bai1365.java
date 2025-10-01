
// 1365. How Many Numbers Are Smaller Than the Current Number

public class bai1365 {
    
    //Solution
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for (int val : nums) {
                if (val > max) max = val;
                if (val < min) min = val;
            }
            
            int[] freq = new int [max - min + 1];
            int[] count = new int [max - min + 1];
                    
            for (int val : nums) freq[val - min]++;
            
            for (int i = 1; i < count.length; ++i) {
                count[i] = count[i-1] + freq[i-1];
            }
            
            int[] res = new int [nums.length];
            
            for (int i = 0; i < nums.length; ++i) {
                int d = nums[i] - min;
                res[i] = count[d];
            }
            
            return res;
        }
    }
}
