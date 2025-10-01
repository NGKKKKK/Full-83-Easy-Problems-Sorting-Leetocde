
// 1460. Make Two Arrays Equal by Reversing Subarrays

public class bai1460 {

    //Solution
    class Solution {
        public boolean canBeEqual(int[] target, int[] arr) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            int max_arr = Integer.MIN_VALUE;
            int min_arr = Integer.MAX_VALUE;
            
            for (int val : target) {
                if (val > max) max = val;
                if (val < min) min = val;
            }
            
            for (int val : arr) {
                if (val > max_arr) max_arr = val;
                if (val < min_arr) min_arr = val;
            }
            
            if (max != max_arr || min != min_arr) return false;
            
            int[] freq = new int [max - min + 1];
            
            for (int val : target) freq[val - min]++;
            
            for (int val : arr) freq[val - min]--;
            
            for (int val : freq) {
                if (val != 0) return false;
            }
            return true;
        }
    }
}
