
// 977. Squares of a Sorted Array

public class bai977 {

    //Solution
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int tmp_indx = 0;
            int size = nums.length;
            while (tmp_indx < size && nums[tmp_indx] < 0) {
                tmp_indx++;
            }
            
            int i = tmp_indx - 1;
            int j = tmp_indx;
            int indx = 0;
            int[] res = new int[size];
            
            while (i >= 0 && j < size) {
                int square_i = nums[i]*nums[i];
                int square_j = nums[j]*nums[j];
                if (square_i < square_j) {
                    res[indx++] = square_i;
                    i--;
                } else {
                    res[indx++] = square_j;
                    j++;
                }
            }
            
            while (i >= 0) {
                int square = nums[i]*nums[i];
                res[indx++] = square;
                i--;
            }
            
            while (j < size) {
                int square = nums[j]*nums[j];
                res[indx++] = square;
                j++;
            }
            
            return res;
        }
    }
}
