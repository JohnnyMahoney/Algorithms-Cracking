package randomAlgs.twoPointers;

import java.util.HashMap;
import java.util.Map;

//O(N) - time complexity
public class MinimumWindowCharacter {

    public static String minWindow(String s, String t) {
        if (t.isEmpty()) return "";

        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }
        int first = 0;
        int have = 0, need = countT.size();
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        for (int second = 0; second < s.length(); second++) {

            char c = s.charAt(second);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (countT.containsKey(c) && window.get(c).equals(countT.get(c)))
                have++;

            while (have == need) {
                if ((second - first + 1) < resLen) {
                    resLen = second - first + 1;
                    res[0] = first;
                    res[1] = second;
                }
                char leftChar = s.charAt(first);
                window.put(leftChar, window.get(leftChar) - 1);
                if (countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar))
                    have--;

                first++;
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }

    public static void main(String[] args) {
        String result = minWindow("LIMEXKYLZXPEXYZ", "XYZ");
        System.out.println(result);
    }
}
