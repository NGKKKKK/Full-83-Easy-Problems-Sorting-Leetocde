
import java.util.ArrayList;
import java.util.List;

// 2273. Find Resultant Array After Removing Anagrams

public class bai2273 {

    //Solution
    class Solution {
        public List<String> removeAnagrams(String[] words) {

            int size = words.length;
            int[][] count = new int[size][26];
            
            for (int i = 0; i < size; ++i) {
                String s = words[i];
                for (int j = 0; j < s.length(); ++j) {
                    int d = s.charAt(j) - 'a';
                    count[i][d]++;
                }
            
            }
            
            List<Integer> tmp = new ArrayList<>();
            
            for (int i = 0; i < size; ++i) {
                if (tmp.isEmpty()) tmp.add(i);
                else {
                    boolean check = true;
                    int indx = tmp.get(tmp.size() - 1);
                    for (int j = 0; j < 26; ++j) {
                        if (count[indx][j] != count[i][j]) {
                            check = false;
                            break;
                        }
                    }
                    if (check == false) tmp.add(i);
                }
            }
            
            List<String> res = new ArrayList<>();
            
            for (int i = 0; i < tmp.size(); ++i) {
                res.add(words[tmp.get(i)]);
            }
            
            return res;
        }
    }
}
