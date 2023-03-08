package recursion;

public class GreatestCDivisor {
    /*
        largest positive integer that divides the number without a remainder
        gcd(48,18)
        48/18 Q=2 R=12
        18/12 Q=1 R=6
        12/6 Q=2 R=0
     */
    public static void main(String[] args) {
        int result = greatestCDivisor(48, 18);
        System.out.println(result);
    }

    //using euclidean algorithm
    static int greatestCDivisor(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return greatestCDivisor(b, a % b);
    }
}
