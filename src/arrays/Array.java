package arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        System.out.println(Arrays.toString(intArray));

        // All together
        String[] sArray = {"a", "b", "c"};
        System.out.println(Arrays.toString(sArray));
    }
}
