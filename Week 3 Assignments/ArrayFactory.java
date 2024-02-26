import java.util.Arrays;
import java.util.Scanner;

public class ArrayFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:"); // Numbers of element in the array
        int n = scanner.nextInt(); // The scanner reads each user-defined array element one by one.
        int[] values = new int[n]; // Elements are set based on the user.

        System.out.println("Enter the array elements:"); // Array elements are entered by the user.
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt(); // Values of array elements between each user defined integer.
    }
    
    scanner.close(); // I always have to remember to close the scanner to prevent any resource leak errors.

        int sumWithoutLargest = sumWithoutLargest(values);
        System.out.println("Sum without the largest: " + sumWithoutLargest);
        System.out.println("Original array: " + Arrays.toString(values));
        // If the user inputs more values than the number of arrays, the program will remove the largest.
        // Then the program will add the elements together and present a sum.

        swapLargestSmallest(values); // Establishes a swap between the smallest and largest user values.
        System.out.println("Array after swapping largest and smallest: " + Arrays.toString(values));
    }

    public static int sumWithoutLargest(int[] values) { // Computes the sum of elements excluding the largest one
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

        int temp = values[largestIndex]; // Swap the largest and smallest integer
        values[largestIndex] = values[smallestIndex];
        values[smallestIndex] = temp;
    }
}