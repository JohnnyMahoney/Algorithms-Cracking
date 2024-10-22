package randomAlgs.SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutDuplicates {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> uniqueValues = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (uniqueValues.contains(currentChar)) {
                uniqueValues.remove(s.charAt(left));
                left++;
            }
            uniqueValues.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String string = "dvdf";
        int result = lengthOfLongestSubstring(string);
        System.out.println(result);
    }
}
