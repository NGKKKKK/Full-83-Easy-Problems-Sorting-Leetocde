
import java.util.Arrays;
import java.util.Comparator;

// 1636. Sort Array by Increasing Frequency

public class bai1636 {

    //Solution
    class Solution {
       public int[] frequencySort(int[] nums) {
           int max = Integer.MIN_VALUE;
           int min = Integer.MAX_VALUE;

           for (int val : nums) {
               if (val > max) max = val;
               if (val < min) min = val;
           }

           int[] freq = new int[max - min + 1];
           for (int val : nums) freq[val - min]++;

           int cnt = 0;
           for (int val : freq) {
               if (val != 0) cnt++;
           }

           int[][] count = new int[cnt][2]; // Frequenly - Number
           int indx = 0;
           for (int i = 0; i < freq.length; i++) {
               if (freq[i] != 0) {
                   count[indx][0] = freq[i];
                   count[indx][1] = i + min;
                   indx++;
               }
           }

            class cong_phuong implements Comparator<int[]> {

                @Override
                public int compare(int[] a, int[] b) {
                    if (a[0] == b[0]) return b[1] - a[1];
                    return a[0] - b[0];
                }
            }
            
            Arrays.sort(count, new cong_phuong());

           int[] res = new int[nums.length];
           indx = 0;
           for (int i = 0; i < cnt; i++) {
               for (int j = 0; j < count[i][0]; j++) {
                   res[indx++] = count[i][1];
               }
           }

           return res;
       }
   }
}
