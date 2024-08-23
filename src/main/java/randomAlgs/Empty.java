package randomAlgs;

public class Empty {

    public String reverseString(String s) {
        char[] arr = s.toCharArray();

        int j = 1;
        int k = 3;

        System.out.println("Before swap: " + new String(arr));
        swap(arr, j, k);
        System.out.println("After swap: " + new String(arr));
        return new String(arr);
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String a = "boolean";
        Empty empty = new Empty();
        String answer = empty.reverseString(a);
        System.out.println('z');

    }
}
