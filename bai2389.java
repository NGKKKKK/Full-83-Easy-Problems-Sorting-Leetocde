
import java.util.Arrays;

// 2389. Longest Subsequence With Limited Sum

public class bai2389 {

    //Solution
    class Solution {
        public int[] answerQueries(int[] nums, int[] queries) {
            
            Arrays.sort(nums);
            
            int[] res = new int [queries.length];
            int size = nums.length;
            int[] sum = new int [size];
            
            sum[0] = nums[0];
            for (int i = 1; i < size; ++i) sum[i] = sum[i-1] + nums[i]; 
            
            for (int i = 0; i < res.length; ++i) {
                int target = queries[i];
                int left = 0;
                int right = size - 1;
                int ans = 0;
                
                while (left <= right) {
                    int mid = left + (right-left)/2;
                    if (sum[mid] <= target) {
                        left = mid + 1;
                        ans = left;
                    }
                    else right = mid - 1;
                }
                
                res[i] = ans;
            }
            
            return res;
        }
    }
}
