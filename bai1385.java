
import java.util.Arrays;

// 1385. Find the Distance Value Between Two Arrays

public class bai1385 {

    //Solution
    class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            int m = arr1.length;
            int n = arr2.length;
            int res = 0;
            
            Arrays.sort(arr2); // nlogn
            
            for (int val : arr1) { // mlogn
                boolean flag = true;
                int left = 0;
                int right = n - 1;
                while (left <= right) {
                    int mid = left + (right-left)/2;
                    int dis = Math.abs(val - arr2[mid]);
                    if (dis <= d) {
                        flag = false;
                        break;
                    }
                    if (val >= arr2[mid]) left = mid + 1;
                    else right = mid - 1;
                }
                if (flag == true) res++;
            }
            return res;
        }
    }
}
