
import java.util.ArrayList;
import java.util.List;

// 2248. Intersection of Multiple Arrays

public class bai2248 {

    //Solution
    class Solution {
        public List<Integer> intersection(int[][] nums) {
            
            final int lowerBound = 0;
            final int upperBound = 1000;
            
            int[] freq = new int[upperBound+1];
            int min = upperBound;
            int max = lowerBound;
            
            for(int[] arr : nums) {
                for(int val : arr) {
                    freq[val]++;
                    min = Math.min(min, val);
                    max = Math.max(max, val);
                }
            }
            
            List<Integer> res = new ArrayList<>();
            int n = nums.length;
            for(int i = min; i <= max; i++) {
                if(freq[i] == n) res.add(i);
            }
            return res;
        }
    }
}
