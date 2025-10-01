
import java.util.Arrays;
import java.util.Comparator;

// 1356. Sort Integers by The Number of 1 Bits

public class bai1356 {

    //Solution
    class Solution {
        public int[] sortByBits(int[] arr) {
            
            Integer[] a = new Integer [arr.length];
            
            for (int i = 0; i < arr.length; ++i) a[i] = arr[i];
            
            class cong_phuong implements Comparator<Integer> {

                @Override
                public int compare(Integer a, Integer b) {
                    if (Integer.bitCount(a) == Integer.bitCount(b)) return a - b;
                    return Integer.bitCount(a) - Integer.bitCount(b);
                }
            }
            Arrays.sort(a, new cong_phuong());
            
            int[] res = new int [arr.length];
            
            for (int i = 0; i < arr.length; ++i) res[i] = (int) a[i];
            
            return res;
        }
    }
}
