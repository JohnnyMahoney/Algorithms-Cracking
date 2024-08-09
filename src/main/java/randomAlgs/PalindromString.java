package randomAlgs;

public class PalindromString {
    public static boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left <= right) {
            if(arr[left] == arr[right]){
                left++;
                right--;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "kaYaK";
        isPalindrome(s);
    }
}
