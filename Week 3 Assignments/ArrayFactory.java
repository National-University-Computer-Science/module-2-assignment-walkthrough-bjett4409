import java.util.Arrays;
import java.util.Scanner;

public class ArrayFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:"); // Numbers of element in the array
        int n = scanner.nextInt();
        int[] values = new int[n]; // Values are set based on the user

        System.out.println("Enter the array elements:"); // Array elements are entered
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt(); //Values of array elements
        scanner.close(); // Scanner is closed
    }

        int sumWithoutLargest = sumWithoutLargest(values);
        System.out.println("Sum without the largest: " + sumWithoutLargest);
        System.out.println("Original array: " + Arrays.toString(values));

        swapLargestSmallest(values);
        System.out.println("Array after swapping largest and smallest: " + Arrays.toString(values));
    }

    // Method to compute the sum of elements excluding the largest one
    public static int sumWithoutLargest(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }

        int sum = 0;
        int largest = values[0];

        for (int value : values) {
            sum += value;
            if (value > largest) {
                largest = value;
            }
        }

        return sum - largest;
    }

    // Method to swap the largest and smallest elements in the array
    public static void swapLargestSmallest(int[] values) {
        if (values == null || values.length < 2) {
            return; // No swap needed for arrays with less than 2 elements
        }

        int largestIndex = 0;
        int smallestIndex = 0;

        for (int i = 1; i < values.length; i++) {
            if (values[i] > values[largestIndex]) {
                largestIndex = i;
            }
            if (values[i] < values[smallestIndex]) {
                smallestIndex = i;
            }
        }

        // Swap
        int temp = values[largestIndex];
        values[largestIndex] = values[smallestIndex];
        values[smallestIndex] = temp;
    }
}