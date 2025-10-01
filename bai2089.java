
import java.util.ArrayList;
import java.util.List;

// 2089. Find Target Indices After Sorting Array

public class bai2089 {

    //Solution
    class Solution {
        public List<Integer> targetIndices(int[] nums, int target) {
            
            int equal = 0;
            int small = 0;
            
            for (int val : nums) {
                if (val == target) equal++;
                if (val < target) small++;
            }
            
            List<Integer> res = new ArrayList<>();
            
            while (equal-- > 0) res.add(small++);
            
            return res;
        }
    }
}
