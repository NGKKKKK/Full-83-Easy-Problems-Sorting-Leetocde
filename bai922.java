
// 922. Sort Array By Parity II

public class bai922 {

    //Solution
    class Solution {
        public int[] sortArrayByParityII(int[] nums) {
            int i = 0;
            int j = 1;
            int size = nums.length;
            
            while (i < size && j < size) {
                if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                    i += 2;
                    j += 2;
                }
                else if (nums[i] % 2 == 0) i += 2;
                else j += 2;
            }
            return nums;
        }
    }
}
