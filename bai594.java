
import java.util.HashMap;

// 594. Longest Harmonious Subsequence

public class bai594 {
    
    //Solution
    class Solution {
        public int findLHS(int[] nums) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            int res = 0;
            
            for (int d : nums) {
                if (!freq.containsKey(d)) freq.put(d, 1);
                else freq.put(d, freq.get(d) + 1);
            }
            
            for (int key : freq.keySet()) {
                if (freq.containsKey(key + 1)) {
                    int x = freq.get(key);
                    int y = freq.get(key + 1);
                    res = Math.max(res, x + y);
                }
            }
            
            return res;
        }   
    }
}
