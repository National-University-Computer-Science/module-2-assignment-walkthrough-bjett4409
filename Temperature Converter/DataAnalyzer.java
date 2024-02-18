import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class DataAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> values = new ArrayList<>();
    
        System.out.println("Enter up to four data values. Entering more than four values will cancel the program.");

        while(scanner.hasNext()) {
            if(scanner.hasNextDouble()) {
                values.add(scanner.nextDouble());
                if(values.size() > 4) {// Check if more than four values have been entered
                    System.out.println("Error: More than four values entered. Please run the program again.");
                    System.exit(1);//Program will terminate if the user input more than four entries
                }
            } else {
                String input = scanner.next();
                if(input.equalsIgnoreCase("end") && values.size() <= 4) {// Verifies if the user entered four values
                    break;
                } else {
                    System.out.println("Invalid input. Please only enter up to four numerical values followed by 'end'.");
                    //Error message if the user does not enter four values
                }
            }
        }
        
        // Calculations are conducted and output if four or fewer values have been entered
        if (!values.isEmpty() && values.size() <= 4) {
            double average = values.stream().mapToDouble(val -> val).average().orElse(0.0);
            double min = Collections.min(values);
            double max = Collections.max(values);
            double range = max - min;
            
            // Output of values after calculations
            System.out.println("Average Value: " + average);
            System.out.println("Smallest Value: " + min);
            System.out.println("Largest Value: " + max);
            System.out.println("The Range: " + range);
        } else {
            System.out.println("No valid entries were entered or not enough values were provided.");
            // Display error message if user does not enter four values
        }
    }
}