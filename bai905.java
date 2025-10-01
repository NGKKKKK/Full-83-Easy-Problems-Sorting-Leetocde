
// 905. Sort Array By Parity

public class bai905 {

    //Solution
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int i = 0;
            int j = nums.length - 1;
            
            while (i <= j) {
                if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                    i++;
                    j--;
                } 
                else if (nums[i] % 2 == 0) i++;
                else j--;
            }
            return nums;
        }
    }
}
