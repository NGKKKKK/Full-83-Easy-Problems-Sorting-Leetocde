
// 389. Find the Difference

public class bai389 {

    //Solution
    class Solution {
        public char findTheDifference(String s, String t) {
            char res = 0;
            char[] s_array = s.toCharArray();
            char[] t_array= t.toCharArray();
            for (char c : s_array) {
                res ^= c;
            }
            for (char c : t_array) {
                res ^= c;
            }
            return res;
        }
    }
}
