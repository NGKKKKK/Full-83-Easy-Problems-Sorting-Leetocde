
import java.util.Arrays;
import java.util.Comparator;

// 2418. Sort the People

public class bai2418 {
    
    //Solution
    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {
            
            int[][] info = new int [names.length][2]; // id - height
            
            for (int i = 0; i < heights.length; ++i) {
                info[i][0] = i;
                info[i][1] = heights[i];
            }
            
            class cong_phuong implements Comparator<int[]> {

                @Override
                public int compare(int[] a, int[] b) {
                    if (a[1] == b[1]) return a[0] - b[0];
                    return b[1] - a[1];
                }
            }
            
            Arrays.sort(info, new cong_phuong());
            
            String[] res = new String [info.length];
            
            for (int i = 0; i < res.length; ++i) res[i] = names[info[i][0]];
            
            return res;
        }
    }
}
