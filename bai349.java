
import java.util.ArrayList;
import java.util.Arrays;

// 349. Intersection of Two Arrays

public class bai349 {
    
    //Solution
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            
            ArrayList<Integer> tmp = new ArrayList<>();
            int indx_nums1 = 0;
            int indx_nums2 = 0;
            
            while (indx_nums1 < nums1.length && indx_nums2 < nums2.length) {
                int val_nums1 = nums1[indx_nums1];
                int val_nums2 = nums2[indx_nums2];
                
                if (val_nums1 < val_nums2) {
                    indx_nums1++;
                } else if (val_nums1 > val_nums2) {
                    indx_nums2++;
                } else {
                    if (tmp.isEmpty() || tmp.get(tmp.size() - 1) != val_nums1) {
                        tmp.add(val_nums1);
                    }
                    indx_nums1++;
                    indx_nums2++;
                }
            }
            int size = tmp.size();
            int[] res = new int[size];
            for (int i = 0; i < size; ++i) {
                res[i] = tmp.get(i);
            }
            return res;
        }
    }
}
