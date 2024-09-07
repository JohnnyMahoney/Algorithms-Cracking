package randomAlgs.fastAndSlowPointers;

public class HappyNumber {
    public static boolean isHappyNumber(int n) {

        int slow = n;
        int fast = sumOfSquaredDigits(n);
        while (fast != 1 && slow != fast) {
            slow = sumOfSquaredDigits(slow);
            fast = sumOfSquaredDigits(fast);
            fast = sumOfSquaredDigits(fast);

        }
        if (fast == 1) {
            System.out.println("true");
            return true;
        } else System.out.println("false");
        return false;
    }

    public static int sumOfSquaredDigits(int n) {
        int totalSum = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            totalSum += (Math.pow(digit, 2));

        }
        return totalSum;
    }

    public static void main(String[] args) {
        isHappyNumber(2);
    }
}
