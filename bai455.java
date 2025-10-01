
import java.util.Arrays;

// 455. Assign Cookies

public class bai455 {

    //Solution
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            
            int i = 0;
            int j = 0;
            int res = 0;
            
            while (i < g.length && j < s.length) {
                if (s[j] < g[i]) {
                    j++;
                } else {
                    res++;
                    i++;
                    j++;
                }
            }
            
            return res;
        }
    }

}
