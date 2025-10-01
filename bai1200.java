
import java.util.ArrayList;
import java.util.List;

// 1200. Minimum Absolute Difference

public class bai1200 {

    //Solution
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for (int val : arr) {
                if (val > max) max = val;
                if (val < min) min = val;
            }
            
            boolean[] exist = new boolean[max - min + 1];
            
            for (int val : arr) {
                int num = val - min;
                exist[num] = true;
            }
            
            List<List<Integer>> res = new ArrayList<>();
            int nearest = -1;
            int minDiff = Integer.MAX_VALUE;
            
            for (int i = 0; i < exist.length; ++i) {
                if (exist[i] == false) continue;
                if (nearest == -1) {
                    nearest = i;
                    continue;
                }
                int diff = i - nearest;
                if (diff < minDiff) {
                    minDiff = diff;
                    res.clear();
                    res.add(new ArrayList<>(List.of(nearest + min, i + min)));
                }
                else if (diff == minDiff) res.add(new ArrayList<>(List.of(nearest + min, i + min)));
                nearest = i;
            }
            
            return res;
        }
    }
}
