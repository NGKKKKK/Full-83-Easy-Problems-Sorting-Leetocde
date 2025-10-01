
import java.util.ArrayList;
import java.util.Collections;

// 2164. Sort Even and Odd Indices Independently

public class bai2164 {

    //Solution
    class Solution {
        public int[] sortEvenOdd(int[] nums) {
            
            ArrayList<Integer> odds = new ArrayList<>();
            ArrayList<Integer> evens = new ArrayList<>();
            ArrayList<Integer> odds_indices = new ArrayList<>();
            ArrayList<Integer> evens_indices = new ArrayList<>();
            
            for (int i = 0; i < nums.length; ++i) {
                if (i % 2 == 0) {
                    evens.add(nums[i]);
                    evens_indices.add(i);
                }
                else {
                    odds.add(nums[i]);
                    odds_indices.add(i);
                }
            }
            
            Collections.sort(evens);
            Collections.sort(odds, Collections.reverseOrder());            
            
            int [] res = new int [nums.length];
            
            int i = 0;
            for (int indx : odds_indices) res[indx] = odds.get(i++);
            
            i = 0;
            for (int indx : evens_indices) res[indx] = evens.get(i++);
            
            return res;
        }
    }
}
