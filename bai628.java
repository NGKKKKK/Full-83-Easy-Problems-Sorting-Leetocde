
// 628. Maximum Product of Three Numbers

public class bai628 {
    
    //Solution
    class Solution {     
    public int maximumProduct(int[] nums) {
            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            int thirdMax = Integer.MIN_VALUE;
            int firstMin = Integer.MAX_VALUE;
            int secondMin = Integer.MAX_VALUE;
            
            for (int d : nums) {
                if (d > firstMax) {
                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = d;
                } else if (d > secondMax) {
                    thirdMax = secondMax;
                    secondMax = d;
                } else if (d > thirdMax) {
                    thirdMax = d;
                }
                
                if (d < firstMin) {
                    secondMin = firstMin;
                    firstMin = d;
                } else if (d < secondMax) {
                    secondMin = d;
                }
            }
            int res = Math.max(firstMax*secondMax*thirdMax, firstMin*secondMin*firstMax);
            return res;
        }
    }
}
