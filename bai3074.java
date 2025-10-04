
// 3074. Apple Redistribution into Boxes

public class bai3074 {

    //Solution
    class Solution {
        public int minimumBoxes(int[] apple, int[] capacity) {
            
            int max = 0;
            
            for (int val : capacity) {
                if (val > max) max = val;
            }
            
            int total = 0;
            
            for (int val : apple) total += val;
            
            int[] freq = new int [max + 1];
            
            for (int val : capacity) freq[val] ++;
            
            int res = 0;
            
            for (int i = freq.length - 1; i >= 1; --i) {
                if (freq[i] <= 0) continue;
                while (total > 0 && freq[i] > 0) {
                    res++;
                    freq[i]--;
                    if (total > i) total -= i;
                    else total -= total;
                }
            }
            
            return res;
        }
    }
}
