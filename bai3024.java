
// 3024. Type of Triangle

public class bai3024 {
    
    //Solution
    class Solution {
        public String triangleType(int[] nums) {
            
            int a = nums[0];
            int b = nums[1];
            int c = nums[2];
            
            if (a <= 0 || b <= 0 || c <= 0) return "none";
            
            if (a + b <= c || b + c <= a || c + a <= b) return "none";
            
            if (a == b && b == c) return "equilateral";
            
            if (a == b || b == c || c == a) return "isosceles";
            
            return "scalene";
        }
    }
}
