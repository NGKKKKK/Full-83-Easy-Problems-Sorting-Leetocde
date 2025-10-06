
// 3684. Maximize Sum of At Most K Distinct Elements

import java.util.Comparator;
import java.util.TreeSet;

public class bai3684 {

    //Solution
    class Solution {
        public int[] maxKDistinct(int[] nums, int k) {

            TreeSet<Integer> arr = new TreeSet<>(Comparator.reverseOrder());

            for (int val : nums) arr.add(val);

            int size = (k <= arr.size()) ? k : arr.size();

            int[] res = new int [size];

            int indx = 0;
            for (int val : arr) {
                if (indx >= size) break;
                res[indx++] = val;
            }

            return res;
        }
    }
}
