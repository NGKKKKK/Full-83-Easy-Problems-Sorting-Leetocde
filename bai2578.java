
import java.util.ArrayList;
import java.util.Collections;


// 2578. Split With Minimum Sum

public class bai2578 {

    //Solution
    class Solution {
        public int splitNum(int num) {
            
            int tmp = num;
            
            ArrayList<Integer> digits = new ArrayList<>();
            
            while (tmp > 0) {
                int d  = tmp % 10;
                digits.add(d);
                tmp /= 10;
            }
            
            if (digits.size() % 2 != 0) digits.add(0);
            
            Collections.sort(digits);
            
            int num1 = 0;
            int num2 = 0;
            int pow = 1;
            int size = digits.size();
            for (int i = size - 1; i >= 0; i -= 2) {
                num1 += pow*digits.get(i);
                num2 += pow*digits.get(i-1);
                pow *= 10;
            }
             
            int res = num1 + num2;
            
            return res;
            
        }
    }
}
