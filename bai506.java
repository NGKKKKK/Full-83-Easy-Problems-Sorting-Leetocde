
import java.util.Arrays;
import java.util.Comparator;

// 506. Relative Ranks

public class bai506 {

    //Solution
    class Solution {
        public String[] findRelativeRanks(int[] score) {
            int size = score.length;
            String[] res = new String[size];
            int[][] tmp = new int[size][2]; // place - score
            
            for (int i = 0; i < size; ++i) {
                tmp[i][0] = i;
                tmp[i][1] = score[i];
            }
            
            class MyComparator implements Comparator<int[]> {
                @Override
                public int compare(int[] a, int[] b) {
                    return b[1] - a[1];
                }
            }
            
            Arrays.sort(tmp, new MyComparator());
            
            for (int i = 0; i < size; ++i) {
                int j = tmp[i][0];
                switch (i) {
                    case 0:
                        res[j] = "Gold Medal";
                        break;
                    case 1:
                        res[j] = "Silver Medal";
                        break;
                    case 2:
                        res[j] = "Bronze Medal";
                        break;
                    default:
                        res[j] = (i+1) + "";
                        break;
                }
            }
            
            return res;
        }
    }
}
