
import java.util.Arrays;

// 2037. Minimum Number of Moves to Seat Everyone

public class bai2037 {

    //Solution
    class Solution {
        public int minMovesToSeat(int[] seats, int[] students) {
            
            Arrays.sort(seats);
            Arrays.sort(students);
            
            int res = 0;
            int size = seats.length;
            
            for (int i = 0; i < size; ++i) {
                res += Math.abs(seats[i] - students[i]);
            }
            
            return res;
        }
    }
}
