package bigO;

public class sumProductArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        sumAndProduct(arr);
    }

    // Time Complexity: O(n)
    static void sumAndProduct(int[] arr) {
        int sum = 0;
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
