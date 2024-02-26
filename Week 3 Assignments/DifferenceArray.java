import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceArray {

    public static void main(String[] args) {
        // Array Example
        // Fixed size: Once an array is initialized, its size cannot be changed.
        int[] numbersArray = new int[5]; // Initialization with fixed size
        numbersArray[0] = 1; // Assigning values by index
        // Arrays do not automatically resize
        System.out.println("Array Elements: " + Arrays.toString(numbersArray));
        
        // Trying to add more than 5 elements will result in an ArrayIndexOutOfBoundsException
        // numbersArray[5] = 6; // Uncommenting this line will cause an error
        
        // ArrayList Example
        // Dynamic size: ArrayList can change its size dynamically.
        ArrayList<Integer> numbersList = new ArrayList<>(); // Initialization without specifying size
        numbersList.add(1); // Adding elements; ArrayList resizes automatically
        numbersList.add(2);
        // Elements can be added indefinitely (limited by memory)
        System.out.println("ArrayList Elements: " + numbersList);
        
        // Additional Operations in ArrayList
        numbersList.remove(Integer.valueOf(1)); // Removing elements by value
        numbersList.add(0, 5); // Adding elements at a specific index
        System.out.println("Updated ArrayList Elements: " + numbersList);
        
        // Demonstrating type safety and generics
        // ArrayLists can ensure type safety using generics
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        // stringList.add(1); // This would cause a compile-time error because of type safety
        
        // Conclusion:
        // Arrays are simple fixed-size containers for storing elements of the same type.
        // ArrayLists are part of the Collections framework, offering dynamic resizing and more functionality like insertion, deletion, and contains methods, at the cost of slightly more overhead.
    }
}
