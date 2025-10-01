
// 1122. Relative Sort Array

public class bai1122 {
    
    //Solution
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int max_2 = Integer.MIN_VALUE;
            int[] res = new int [arr1.length];
            
            for (int val : arr1) {
                if (val > max) max = val;
                if (val < min) min = val;
            }
            
            for (int val : arr2) {
                if (val > max_2) max_2 = val;
            }
            
            int[] freq = new int [max - min + 1];
            
            for (int val : arr1) freq[val - min]++;
            
            int indx = 0;
            for (int val : arr2) {
                while (freq[val - min] > 0) {
                    res[indx++] = val;
                    freq[val - min]--;
                }
            }
            
            for (int i = 0; i < freq.length; ++i) {
                while (freq[i] > 0) {
                    res[indx++] = (i + min);
                    freq[i]--;
                }
            }
            
            return res;
        }
    }
}
