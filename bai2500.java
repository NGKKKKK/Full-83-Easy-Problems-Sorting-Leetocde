
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

// 2500. Delete Greatest Value in Each Row

public class bai2500 {

    //Solution
    class Solution {
        public int deleteGreatestValue(int[][] grid) {
            
            int m = grid.length;
            
            // test cach moi dung max-heap ~ dung sort theo ha`ng van nhanh hon
            
            ArrayList<PriorityQueue<Integer>> arr = new ArrayList<PriorityQueue<Integer>>();
            
            for (int i = 0; i < m; ++i) {
                PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
                for (int val : grid[i]) {
                    que.add(val);
                }
                arr.add(que);
            }
            
            int res = 0;
            
            for (int j = 0; j < grid[0].length; ++j) {
                int max = -1;
                for (int i = 0; i < m; ++i) {
                    int currentMax = arr.get(i).poll();
                    max = Math.max(max, currentMax);
                }
                res += max;
            }
            
            return res;
        }
    }
}
