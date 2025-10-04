
import java.util.Arrays;

// 2974. Minimum Number Game

public class bai2974 {

    //Solution
    class Solution {
        public int[] numberGame(int[] nums) {
            
            Arrays.sort(nums);
            int[] res = new int [nums.length];
            int indx = 0;
            
            for (int i = 0; i < nums.length - 1; i += 2) {
                int first = nums[i+1];
                int second = nums[i];
                res[indx++] = first;
                res[indx++] = second;
            }
            
            return res;
        }
    }
}
