
// 2099. Find Subsequence of Length K With the Largest Sum

public class bai2099 {

    //Solution
    class Solution {
        public int[] maxSubsequence(int[] nums, int k) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for (int val : nums) {
                if (val > max) max = val;
                if (val < min) min = val;
            }
            
            int[] freq = new int [max - min + 1];
            int[] take = new int [max - min + 1];
            int size = k;
            
            for (int val : nums) freq[val - min]++;
            
            for (int i = freq.length - 1; i >= 0 && k > 0; --i) {
                while (k > 0 && freq[i] > 0) {
                    take[i]++;
                    k--;
                    freq[i]--;
                }
            }
            
            int[] res = new int [size];
            
            int indx = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (indx >= size) break;
                int j = nums[i] - min;
                if (indx < size && take[j] > 0) {
                    res[indx++] = (nums[i]);
                    take[j]--;
                }
            }
            return res;
        }
    }
}
