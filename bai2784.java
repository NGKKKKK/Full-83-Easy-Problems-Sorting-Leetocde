
// 2784. Check if Array is Good

public class bai2784 {

    //Solution
    class Solution {
        public boolean isGood(int[] nums) {
            
            int max = Integer.MIN_VALUE;
            int n = nums.length;
            
            for (int val : nums) {
                max = (val > max) ? val : max;
            }
            
            int[] freq = new int [max + 1];
            
            for (int val : nums) freq[val]++;
            
            
            for (int i = 1; i <= max; ++i) {
                if (i != max && freq[i] != 1) return false;
                if (i == max && freq[i] != 2) return false;
            }
            
            return true;
        }
    }
}
