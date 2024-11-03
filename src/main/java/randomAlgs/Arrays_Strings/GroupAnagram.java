package randomAlgs.Arrays_Strings;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            result.putIfAbsent(sortedS, new ArrayList<>());
            result.get(sortedS).add(s);

        }
        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        String[] ang = {"act", "pots", "tops", "cat", "stop", "hat"};

        List<List<String>> result = groupAnagrams(ang);
        System.out.println(result.toString());
    }
}
