
import java.util.Collections;
import java.util.List;

// 2824. Count Pairs Whose Sum is Less than Target

public class bai2824 {

    //class Solution {
    class Solution {
        public int countPairs(List<Integer> nums, int target) {
            
            Collections.sort(nums);
            int res = 0;
            int left = 0;
            int right = nums.size() - 1;
            
            while (left <= right) {
                if (nums.get(left) + nums.get(right) < target) {
                    res += right - left;
                    left++;
                }
                else right--;
            }
            
            return res;
        }
    }
}
