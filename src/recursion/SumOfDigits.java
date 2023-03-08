package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int result = sumOfDigits(112);
        System.out.println(result);
    }

    static int sumOfDigits(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
}
