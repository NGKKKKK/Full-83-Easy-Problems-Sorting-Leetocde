
import java.util.Arrays;

// 3545. Minimum Deletions for At Most K Distinct Characters

public class bai3545 {
    
    //Solution
    class Solution {
        public int minDeletion(String s, int k) {
            
            int[] freq = new int [26];

            for (int i = 0; i < s.length(); ++i) {
                char c = s.charAt(i);
                int d = c - 'a';
                freq[d]++;
            }

            int count = 0;

            for (int val : freq) {
                if (val > 0) count++;
            }

            if (count <= k) return 0;
            
            int need = count - k;

            Arrays.sort(freq);

            int res = 0;
            int start = 0;
            while (freq[start] == 0) start++;

            while (need-- > 0 && start < freq.length) {
                res += freq[start++];
            }

            return res;
        }
    }
}
