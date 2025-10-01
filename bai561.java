
// 561. Array Partition

public class bai561 {
    
    //Solution
    class Solution {
        public int arrayPairSum(int[] nums) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int size = nums.length;
            
            for (int i = 0; i < size; ++i) {
                if (nums[i] > max) max = nums[i];
                if (nums[i] < min) min = nums[i];
            }
            
            int[] freq = new int [max + 1 - min];
            
            for (int i = 0; i < size; ++i) {
                freq[nums[i] - min]++;
            }
            
            int res = 0;
            boolean flag = false;
            
            for (int i = 0; i < (max+1-min); ++i) {
                if (freq[i] == 0) continue;
                
                if (freq[i] % 2 == 0) {
                    if (flag == false) res += (freq[i]/2)*(i+min);
                    else {
                        res += ((freq[i]-2)/2)*(i+min);
                        res += (i+min);
                    }
                } else {
                    if (flag == true) {
                        res += ((freq[i]-1)/2)*(i+min);
                        flag = false;
                    } else {
                        res += ((freq[i]-1)/2)*(i+min);
                        res += (i+min);
                        flag = true;
                    }
                }
            }
            return res;
        }
    }
}
