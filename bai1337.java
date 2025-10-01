
import java.util.Arrays;
import java.util.Comparator;


// 1337. The K Weakest Rows in a Matrix

public class bai1337 {

    //Solution
    class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
            int m = mat.length;
            int n = mat[0].length;
            int[][] power = new int [m][2]; // Soldiers - Row index
            
            for (int i = 0; i < m; ++i) { 
                int left = 0, right = n-1;
                while (left <= right) {
                    int mid = left + (right-left)/2;
                    if (mat[i][mid] == 1) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                power[i][0] = left;
                power[i][1] = i;
            }
            
            class cong_phuong implements Comparator<int[]> {

                @Override
                public int compare(int[] a, int[] b) {
                    if (a[0] == b[0]) return a[1] - b[1];
                    return a[0] - b[0];
                }
            }
            
            Arrays.sort(power, new cong_phuong());
            
            int[] res = new int[k];
            for (int i = 0; i < k; ++i) res[i] = power[i][1];
            return res;
        }
    }
}
