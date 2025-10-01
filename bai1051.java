
// 1051. Height Checker

public class bai1051 {

    //Solution
    class Solution {
        public int heightChecker(int[] heights) {
            int maxHeight = Integer.MIN_VALUE;
            int minHeight = Integer.MAX_VALUE;
            
            for (int h : heights) {
                if (h > maxHeight) maxHeight = h;
                if (h < minHeight) minHeight = h;
            }
            
            int[] freq = new int[maxHeight - minHeight + 1];
            
            for (int h : heights) freq[h - minHeight]++;
            
            int res = 0;
            int currHeight = 0;
            
            for (int i = 0; i < heights.length; ++i) {
                while (freq[currHeight] == 0) currHeight++;
                
                if (heights[i] - minHeight != currHeight) res++;
                
                freq[currHeight]--;
            }
            return res;
        }
    }
}
