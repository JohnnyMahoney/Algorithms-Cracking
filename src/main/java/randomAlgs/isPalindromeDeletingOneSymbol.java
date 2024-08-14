package randomAlgs;

public class isPalindromeDeletingOneSymbol {
    public static boolean isPalindrome(String s) {
        char[] comparing = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (comparing[start] == comparing[end]) {
                start++;
                end--;
            } else
                return palindrome(comparing, start, end - 1) || palindrome(comparing, start + 1, end);
        }

        return true;
    }

    public static boolean palindrome(char[] array, int a, int b) {
        while (a < b) {
            if (array[a] == array[b]) {
                a++;
                b--;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String abc = "abciadvvdacba";
        boolean answer = isPalindrome(abc);
        System.out.println(answer);

    }

}
