package randomAlgs;

//Given an integer x, return true if x is a palindrome  and false otherwise.
// Solve it without converting integer to a string


public class PalindromNumber {
    public static void main(String[] args) {
        int x = 1221;
        isPalindrome(x);
    }
    public static boolean isPalindrome(int x) {
        int original_number = x;
        int new_number = 0;
        while (x > 0) {
            int digit = x % 10;
            new_number = (new_number * 10) + digit;
            x = x / 10;
        }
        if (original_number == new_number)
            return true;
        else
            return false;
    }
}
