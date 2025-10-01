
// 1859. Sorting the Sentence

public class bai1859 {

    //Solution
    class Solution {
        public String sortSentence(String s) {
            
            String[] st = s.split("\\s+");
            String[] tmp = new String[st.length];
            
            for (String ss : st) {
                int size = ss.length();
                char c = ss.charAt(size - 1);
                int indx = (c - '0') - 1;
                tmp[indx] = ss.substring(0, size - 1);
            }
            
            String res = "";
            
            for (int i = 0; i < tmp.length; ++i) {
                res += tmp[i];
                if (i < tmp.length - 1) res += " ";
            }
            
            return res;
        }
    }
}
