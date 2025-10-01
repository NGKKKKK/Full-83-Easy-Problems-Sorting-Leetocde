
import java.util.Arrays;

// 1619. Mean of Array After Removing Some Elements

public class bai1619 {

    //Solution
    class Solution {
        public double trimMean(int[] arr) {
            int size = arr.length;
            double percent = 5.0/100;
            Arrays.sort(arr);
            int start = (int) (size*percent);
            int end = (int) (size - percent*size);
            double sum = 0;
            for (int i = start; i < end; ++i) sum += (double) arr[i];
            return sum/(end-start);
        }
    }
}
