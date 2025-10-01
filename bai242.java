
// 242. Valid Anagram

public class bai242 {
    
    //Solution
    class Solution {
        public boolean isAnagram(String s, String t) {
            int[][] alphabet = new int[26][2];
            for (int i = 0; i < 26; ++i) {
                alphabet[i][0] = 0;
                alphabet[i][1] = 0;
            }
            
            //Calculate s
            for (int i = 0; i < s.length(); ++i) {
                int d = s.charAt(i) - 'a';
                alphabet[d][0]++;
            }
            
            //Calculate t
            for (int i = 0; i < t.length(); ++i) {
                int d = t.charAt(i) - 'a';
                alphabet[d][1]++;
            }
            
            for (int i = 0; i < 26; ++i) {
                if (alphabet[i][0] != alphabet[i][1]) {
                    return false;
                }
            }
            return true;
        }
    }
}
