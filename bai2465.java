
import java.util.Arrays;
import java.util.HashSet;

// 2465. Number of Distinct Averages

public class bai2465 {

    //Solution
    class Solution {
        public int distinctAverages(int[] nums) {
            
            Arrays.sort(nums);
            
            int left = 0;
            int right = nums.length - 1;
            HashSet<Double> sex = new HashSet<>();
            
            while (left <= right) {
                double avg = (nums[left] + nums[right])/2.0;
                sex.add(avg);
                left++;
                right--;
            }
            
            int res = sex.size();
            
            return res;
        }
    }
}
