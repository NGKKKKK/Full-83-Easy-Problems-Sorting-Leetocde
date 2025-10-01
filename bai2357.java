
// 2357. Make Array Zero by Subtracting Equal Amounts

public class bai2357 {

    //Solution
    class Solution {
        public int minimumOperations(int[] nums) {
            
            final int upperBound = 100;
            
            boolean[] isChoosed = new boolean[upperBound + 1];
            
            int size = 0;
            
            for (int val : nums) {
                if (isChoosed[val] == true || val <= 0) continue;
                size++;
                isChoosed[val] = true;
            } 

            return size;
            
        }
    }
}
