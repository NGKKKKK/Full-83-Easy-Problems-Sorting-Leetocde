
// 1608. Special Array With X Elements Greater Than or Equal X

public class bai1608 {

    //Solution
    class Solution {
        public int specialArray(int[] nums) {
            int max = Integer.MIN_VALUE;
            for (int val : nums) {
                if (val > max) max = val;
            }

            int[] freq = new int[max + 1];
            for (int val : nums) freq[val]++;

            int[] count = new int[max + 1];
            count[max] = freq[max];
            for (int i = max - 1; i >= 0; i--) {
                count[i] = count[i + 1] + freq[i];
            }

            for (int x = 1; x <= nums.length; x++) {
                if (x <= max && count[x] == x) return x;
            }
            return -1;
        }
    }
}
