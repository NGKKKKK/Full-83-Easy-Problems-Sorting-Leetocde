
import java.util.ArrayList;
import java.util.List;

// 1403. Minimum Subsequence in Non-Increasing Order

public class bai1403 {

    //Solution
    class Solution {
        public List<Integer> minSubsequence(int[] nums) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int base_sum = 0;
            
            for (int val : nums) {
                base_sum += val;
                if (val > max) max = val;
                if (val < min) min = val;
            }
            
            int[] freq = new int [max - min + 1];
            
            for (int val : nums) freq[val - min]++;
            
            int sum = 0;
            List<Integer> res = new ArrayList<>();
            for (int i = freq.length-1; i >= 0; --i) {
                while (freq[i] > 0 && sum <= base_sum/2) {
                    sum += (i + min);
                    res.add((i + min));
                    freq[i]--;
                }
            }
            return res;
        }
    }
}
