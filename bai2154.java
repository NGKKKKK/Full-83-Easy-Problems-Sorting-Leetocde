
// 2154. Keep Multiplying Found Values by Two

public class bai2154 {

    //Solution
    class Solution {
        public int findFinalValue(int[] nums, int original) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for (int val : nums) {
                if (val > max) max = val;
                if (val < min) min = val;
            }
            
            int[] freq = new int [max - min + 1];
            
            for (int val : nums) freq[val - min]++;
            
            int res = original;
            
            while (res <= max && res >= min && freq[res - min] > 0) res = res*2;
            
            return res;
        }
    }
}
