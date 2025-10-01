
// 1346. Check If N and Its Double Exist

public class bai1346 {

    //Solution
    class Solution {
        public boolean checkIfExist(int[] arr) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for (int val : arr) {
                if (val > max ) max = val;
                if (val < min) min = val;
            }
            
            int[] freq = new int[max - min + 1];
            
            for (int val : arr) freq[val-min]++;
            
            for (int val : arr) {
                if (val % 2 != 0) continue;
                int need = val/2;
                if (need < min || need > max) continue;
                if (need == val && freq[val - min] > 1) return true;
                if (need != val && freq[need - min] > 0) return true;
            }
            return false;
        }
    }
}
