package randomAlgs.realInterviewProblems;

public class GetSubstring {

    //O(n) - time complexity
    public static String getSubstring(String input_str, int k) {
        int n = input_str.length();
        int left = 0;
        int right = 0;
        int count = 0;
        String result = null;

        while (right < n) {
            if (input_str.charAt(right) == '1') {
                count++;
            }
            right++;

            while (count == k) {
                String currentSubstring = input_str.substring(left, right);

                if (result == null || currentSubstring.length() < result.length() ||
                        (currentSubstring.length() == result.length() && currentSubstring.compareTo(result) < 0)) {
                    result = currentSubstring;
                }
                if (input_str.charAt(left) == '1') {
                    count--;
                }
                left++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        String input = "0101101";
        String result = getSubstring(input, 3);
        System.out.println(result);
    }
}
