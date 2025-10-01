
import java.util.Arrays;
import java.util.HashMap;

// 1331. Rank Transform of an Array

public class bai1331 {

    //Solution
    class Solution {
        public int[] arrayRankTransform(int[] arr) {
            int[] arr1 = arr.clone();
            Arrays.sort(arr1);
            int[] res = new int [arr1.length];
            HashMap<Integer, Integer> rank = new HashMap<>(); // value - rank
            
            int currRank = 1;
            for (int i = 0; i < arr1.length; ++i) {
                int val = arr1[i];
                if (rank.containsKey(val) == true) continue;
                rank.put(val, currRank++);
            }
            
            for (int i = 0; i < arr.length; ++i) {
                res[i] = (int) rank.get(arr[i]);
            }
            
            return res;
        }
    }
}
