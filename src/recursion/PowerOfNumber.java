package recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        int result = powerOfNumber(5, 2);
        System.out.println(result);
    }

    static int powerOfNumber(int base, int exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0) {
            return 1;
        }
        return base * powerOfNumber(base, exp - 1);
    }
}
