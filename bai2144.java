
import java.util.Arrays;

// 2144. Minimum Cost of Buying Candies With Discount

public class bai2144 {

    //Solution
    class Solution {
        public int minimumCost(int[] cost) {
            int size = cost.length;
            
            if (size <= 2) {
                int res = 0;
                for (int val : cost) res += val;
                return res;
            }
            
            Arrays.sort(cost);
            
            int res = 0;
            
            int i = size - 1;
            while (i >= 2) {
                res += cost[i] + cost[i-1];
                i -= 3;
            }
            
            for (int j = 0; j <= i; ++ j) res += cost[j];
            
            return res;
        }
    }
}
