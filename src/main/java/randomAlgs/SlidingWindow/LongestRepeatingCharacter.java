package randomAlgs.SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacter {

    public static int characterReplacement(String s, int k) {
        if (s.length() < 1)
            return 0;
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int first = 0, second = 0;
        char[] arr = s.toCharArray();
        map.put(arr[second], 1);

        while (second < arr.length) {

            int maxValue = Integer.MIN_VALUE;
            for (int value : map.values()) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
            if ((second - first + 1) - maxValue <= k) {
                result = Math.max(result, second - first + 1);
                second++;
                if (second < arr.length) {
                    map.put(arr[second], map.getOrDefault(arr[second], 0) + 1);
                }
            } else {
                map.put(arr[first], map.get(arr[first]) - 1);
                if (map.get(arr[first]) == 0) {
                    map.remove(arr[first]);
                }
                first++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "AAAA";
        int result = characterReplacement(s, 2);
        System.out.println(result);
    }
}
