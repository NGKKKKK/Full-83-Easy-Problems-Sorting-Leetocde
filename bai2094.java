
import java.util.ArrayList;

import java.util.TreeSet;

// 2094. Finding 3-Digit Even Numbers

public class bai2094 {

    //Solution
    class Solution {
        public int[] findEvenNumbers(int[] digits) {
            
            // Do phuc tap cao..
            TreeSet<Integer> set = new TreeSet<>();

            for (int i = 0; i < digits.length; ++i) {
                if (digits[i] == 0) continue;
                for (int j = 0; j < digits.length; ++j) {
                    if (j == i) continue;
                    for (int k = 0; k < digits.length; ++k) {
                        if (k == i || k == j) continue;
                        if (digits[k] % 2 != 0) continue;
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        set.add(num);
                    }
                }
            }
            
            int size = set.size();
            int[] res = new int[size];
            int idx = 0;
            for (int val : set) res[idx++] = val;
            return res;
        }
    }
}
