
// 88. Merge Sorted Array

public class bai88 {
    
    //Solution
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] res = new int[m + n];
            int indx_nums1 = 0;
            int indx_nums2 = 0;
            int indx_res = 0;
            
            while (indx_nums1 < m && indx_nums2 < n) {
                if (nums1[indx_nums1] < nums2[indx_nums2]) {
                    res[indx_res++] = nums1[indx_nums1++];
                } else {
                    res[indx_res++] = nums2[indx_nums2++];
                }
            }
            
            while (indx_nums1 < m) {
                res[indx_res++] = nums1[indx_nums1++];
            }
            
            while (indx_nums2 < n) {
                res[indx_res++] = nums2[indx_nums2++];
            }
            
            for (int i = 0; i < (m + n); ++i) {
                nums1[i] = res[i];
            }
        }
    }

    
}
