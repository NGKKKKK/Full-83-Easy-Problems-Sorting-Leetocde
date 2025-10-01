
// 2475. Number of Unequal Triplets in Array

public class bai2475 {

    //Solution
    class Solution {
        public int unequalTriplets(int[] nums) {
            
            final int upperBound = 1000;
            
            int[] freq = new int [upperBound + 1];
            
           int pair_3 = 0;
           int pair_2 = 0;
           
           // pair_3_with_a = pair_2_without_a ~ ket hop a voi so_luong_cap_2_khong_chua_a
           // pair_2_without_a = pair_2 - pair_2_with_a ~ so_luong_cac_cap_2_thoa_man - so_luong_cac_cap_2_chua_a
           // pair_2_with_a = freq[a] * (i - freq[a]) ~ so_luong_a_truoc_do * so_luong_so_khac_a_truoc_do
           
           for (int i = 0; i < nums.length; ++i) {
               pair_3 += pair_2 - freq[nums[i]]*(i - freq[nums[i]]);
               pair_2 += i - freq[nums[i]];
               freq[nums[i]]++;
           }
           
           return pair_3;
        }
    }
}
