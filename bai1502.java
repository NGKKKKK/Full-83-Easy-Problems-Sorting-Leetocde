
// 1502. Can Make Arithmetic Progression From Sequence

public class bai1502 {

    //Solution
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int size = arr.length;
            
            for (int val : arr) {
                if (val > max) max = val;
                if (val  < min) min = val;
            }
            
            if (max == min) return true;
            
            boolean[] freq = new boolean [max - min + 1];
            
            for (int val : arr) freq[val - min] = true;
            
            if ((max - min) % (size - 1) != 0) return false;
            
            int d = (max - min)/(size - 1);
            int a = min;
            while (a <= max) {
                if (freq[a - min] == false) return false;
                a = a + d;
            }
            return true;
        }
    }
}
