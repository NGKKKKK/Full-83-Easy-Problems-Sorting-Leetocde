
// 3467. Transform Array by Parity

public class bai3467 {

    //Solution
    class Solution {
        public int[] transformArray(int[] nums) {

            int[] res = new int [nums.length];
            int even = 0;
            int odd = 0;

            for (int val : nums) {
                if (val % 2 == 0) even++;
                else odd++;
            }

            int indx = 0;
            while (even-- > 0) res[indx++] = 0;
            while (odd-- > 0) res[indx++] = 1;

            return res;
        }
    }
}
