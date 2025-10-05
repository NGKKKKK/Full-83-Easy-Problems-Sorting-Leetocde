
// 3536. Maximum Product of Two Digits

public class bai3536 {
    
    //Solution
    class Solution {
        public int maxProduct(int n) {
            
            int firstMax = 0;
            int secondMax = 0;

            while (n > 0) {
                int d = n % 10;
                if (d > firstMax) {
                    secondMax = firstMax;
                    firstMax = d;
                }
                else if (d > secondMax) secondMax = d;
                n /= 10;
            }

            int res = firstMax*secondMax;
            
            return res;
        }
    }
}
