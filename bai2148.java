
// 2148. Count Elements With Strictly Smaller and Greater Elements 

public class bai2148 {

    //Solution
    class Solution {
        public int countElements(int[] nums) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for (int val : nums) {
                if (val > max) max = val;
                if (val < min) min = val;
            }
            
            if (max == min) return 0;
            
            int res = 0;
            
            for (int val : nums) {
                if (val != max && val != min) res++;
            }
            
            return res;
        }
    }
}
