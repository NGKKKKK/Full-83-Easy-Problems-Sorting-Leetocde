
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 3606. Coupon Code Validator

public class bai3606 {
    
    //Solution
    class Solution {
        public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
            
            List<List<String>> valid = new ArrayList<>();
            int size = code.length;

            for (int i = 0; i < size; ++i) {
                if (isActive[i] == false) continue;
                String c = code[i];
                if (c.isEmpty()) continue;
                String b = businessLine[i];
                boolean check = true;
                
                for (int j = 0; j < c.length(); ++j) {
                    char cc = c.charAt(j);
                    if (!Character.isAlphabetic(cc) && !Character.isDigit(cc) && cc != '_') {
                        check = false;
                        break;
                    }
                }

                if (check == false) continue;

                if (b.equals("electronics") || b.equals("grocery") || b.equals("pharmacy") || b.equals("restaurant")) {
                    String key;
                    key = switch (b) {
                        case "electronics" -> "0";
                        case "grocery" -> "1";
                        case "pharmacy" -> "2";
                        default -> "3";
                    };
                    valid.add(new ArrayList<>(List.of(c, key)));
                }
            }

            class cong_phuong implements Comparator<List<String>> {

                @Override
                public int compare(List<String> a, List<String> b) {
                    if (a.get(1).equals(b.get(1))) return a.get(0).compareTo(b.get(0));
                    return a.get(1).compareTo(b.get(1));
                }
            }

            Collections.sort(valid, new cong_phuong());

            List<String> res = new ArrayList<>();

            for (List<String> ss : valid) res.add(ss.get(0));

            return res;
        }
    }
}
