import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class ExceptionHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> values = new ArrayList<>();

        System.out.println("Enter your values. Type 'end' to finish. Warning: Entering more than five values will prompt you to restart the program. ");

        while (true) {
            if (values.size() >= 5) {
                System.out.println("Error: More than five values were entered. Please restart the program. ");
                break; // Gracefully exit the program
            }

            System.out.print("Please enter your five values here: ");
            if (!scanner.hasNextDouble()) {
                String input = scanner.next();
                if (input.equalsIgnoreCase("end")) {
                    break; // Exit the loop if 'end' is entered
                } else {
                    System.out.println("Invalid input. Please enter a numeric value or 'end' to finish. ");
                    continue; // Skip the rest of the loop and prompt again
                }
            }

            try {
                double value = scanner.nextDouble();
                values.add(value);
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid numeric value. ");
                scanner.next(); // Consume the invalid input to avoid infinite loop
            }
        }
        scanner.close();

        if (!values.isEmpty() && values.size() <= 5) {
            double average = values.stream().mapToDouble(val -> val).average().orElse(0.0);
            double min = Collections.min(values);
            double max = Collections.max(values);
            double range = max - min;

            System.out.println("Average Value: " + average);
            System.out.println("Smallest Value: " + min);
            System.out.println("Largest Value: " + max);
            System.out.println("The Range: " + range);
        } else {
            System.out.println("No valid entries were entered or not enough values were provided. ");
        }
    }
}