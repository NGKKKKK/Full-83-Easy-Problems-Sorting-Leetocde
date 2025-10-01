
import java.util.ArrayList;
import java.util.Collections;

// 2231. Largest Number After Digit Swaps by Parity

public class bai2231 {

    //Solution
    class Solution {
        public int largestInteger(int num) {

            ArrayList<Integer> digits = new ArrayList<>();

            while (num > 0) {
                int d = num % 10;
                digits.add(d);
                num /= 10;
            }

            Collections.reverse(digits);

            ArrayList<Integer> odds = new ArrayList<>();
            ArrayList<Integer> evens = new ArrayList<>();

            for (int i = 0; i < digits.size(); ++i) {
                if (digits.get(i) % 2 == 0) {
                    evens.add(digits.get(i));
                }
                else {
                    odds.add(digits.get(i));
                }
            }

            evens.sort(Collections.reverseOrder());
            odds.sort(Collections.reverseOrder());

            int i_pow_even = 0, i_pow_odd = 0;
            long res = 0;
            for (int d : digits) res = res * 10 + (d % 2 == 0 ? evens.get(i_pow_even++) : odds.get(i_pow_odd++));

            return (int) res;
        }
    }
}
