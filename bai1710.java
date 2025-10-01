
import java.util.Arrays;
import java.util.Comparator;

// 1710. Maximum Units on a Truck

public class bai1710 {

    //Solution
    class Solution {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
            int res = 0;
            
            class cong_phuong implements Comparator<int[]> {

                @Override
                public int compare(int[] a, int[] b) {
                    if (a[1] == b[1]) return b[0] - a[0];
                    return b[1] - a[1];
                }
            }
            
            Arrays.sort(boxTypes, new cong_phuong());
            
            for (int i = 0; i < boxTypes.length; ++i) {
                while (boxTypes[i][0] > 0 && truckSize > 0) {
                    res += boxTypes[i][1];
                    boxTypes[i][0]--;
                    truckSize--;
                }
            }
            
            return res;
        }
    }
}
