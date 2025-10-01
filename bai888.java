
import java.util.HashSet;

// 888. Fair Candy Swap

public class bai888 {

    //Solution
    class Solution {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int aliceCandy = 0;
            int bobCandy = 0;
            
            for (int candy : aliceSizes) {
                aliceCandy += candy;
            }
            
            for (int candy : bobSizes) {
                bobCandy += candy;
            }
            
            int ans1 = 0;
            int ans2 = 0;
            int diffCandy = (aliceCandy - bobCandy)/2;
            
            HashSet<Integer> bob = new HashSet<>();
            for (int candy : bobSizes) bob.add(candy);
            
            for (int candy : aliceSizes) {
                int tmp = candy - diffCandy;
                if (bob.contains(tmp)) {
                    ans1 = candy;
                    ans2 = tmp;
                }
            }
            
            int[] res = {ans1, ans2};
            return res;
        }
    }
}
