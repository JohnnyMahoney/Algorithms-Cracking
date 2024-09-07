package randomAlgs.Other;

import java.util.HashMap;
import java.util.Map;

//Given a string of roman numeral, convert it to an integer.

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.length() - 1 != i && m.get(s.charAt(i)) < m.get(s.charAt(i + 1)))
                answer = answer - m.get(s.charAt(i));
            else
                answer += m.get(s.charAt(i));
        }
        return answer;
    }
}
