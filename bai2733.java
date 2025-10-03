
// 2733. Neither Minimum nor Maximum

public class bai2733 {
    
    //Solution
    class Solution {
        public int findNonMinOrMax(int[] nums) {
            
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for (int val : nums) {
                if (val > max) max = val;
                if (val < min) min = val;
            }
            
            if (max == min) return -1;
            
            boolean[] freq = new boolean[max - min + 1];
            
            for (int val : nums) freq[val - min] = true;
            
            for (int i = 0; i < freq.length; ++i) {
                if (freq[i] == false) continue;
                
                int num = i + min;
                if (num == max || num == min) continue;
                
                return (i + min);
            }
            
            return -1;
        }
    }
}
