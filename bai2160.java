
import java.util.Arrays;

// 2160. Minimum Sum of Four Digit Number After Splitting Digits

public class bai2160 {

    //Solution
    class Solution {
        public int minimumSum(int num) {
            int[] digits = new int [4];
            
            for (int i = 0; i < 4; ++i) {
                digits[i] = num % 10;
                num /= 10;
            }
            
            Arrays.sort(digits);
            
            int case1 = (digits[0]*10 + digits[3]) + (digits[1]*10 + digits[2]);
            int case2 = (digits[0]*10 + digits[2]) + (digits[1]*10 + digits[3]);
            
            return Math.min(case1, case2);
        }
    }
}
