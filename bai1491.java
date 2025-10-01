
// 1491. Average Salary Excluding the Minimum and Maximum Salary

public class bai1491 {

    //Solution
    class Solution {
        public double average(int[] salary) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int base_sum = 0;
            
            for (int val : salary) {
                base_sum += val;
                if (val > max) max = val;
                if (val < min) min = val;
            }
            
            int sum = base_sum - max - min;
            double avg = (double)(sum)/(salary.length - 2);
            return avg;      
        }
    }
}
