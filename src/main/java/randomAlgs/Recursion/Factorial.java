package randomAlgs.Recursion;

public class Factorial {
    //call stack - every recursion operation added in so-called call stack.
    // And beginning from n=2 each operation will execute
    public static int factorial(int n) {

        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = factorial(5);
        System.out.println(n);
    }
}
