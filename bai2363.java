
import java.util.ArrayList;
import java.util.List;

// 2363. Merge Similar Items

public class bai2363 {

    //Solution
    class Solution {
        public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
            
            final int upperBound = 1000;
            final int lowerBound = 1;
            
            int max = upperBound + 1;
            int min = lowerBound - 1;
            
            for (int[] arr : items1) {
                if (arr[0] > max) max = arr[0];
                if (arr[0] < min) min = arr[0];
            }
            
            for (int[] arr : items2) {
                if (arr[0] > max) max = arr[0];
                if (arr[0] < min) min = arr[0];
            }
            
            int[] weight = new int [max - min + 1]; // weight[i] ~ total weight of value (i + min)
            
            for (int[] arr : items1) weight[arr[0] - min] += arr[1];
            
            for (int[] arr : items2) weight[arr[0] - min] += arr[1];
            
            List<List<Integer>> res = new ArrayList<>();
            
            for (int i = 0; i < weight.length; ++i) {
                if (weight[i] == 0) continue;
                res.add(new ArrayList<>(List.of((i + min), weight[i])));
            }
            
            return res;
        }
    }
}
