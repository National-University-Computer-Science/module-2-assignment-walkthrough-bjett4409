import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Map to store character frequencies
        Map<Character, Integer> frequencies = new HashMap<>();
        
        // Fill the map with character frequencies
        for (char c : input.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }
        
        // Find the maximum frequency
        int maxFrequency = 0;
        for (int freq : frequencies.values()) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }
        
        // Find all characters with the maximum frequency
        Set<Character> maxChars = new HashSet<>();
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                maxChars.add(entry.getKey());
            }
        }
        
        // Print the characters with their frequency
        System.out.println("Most frequent character(s) with frequency:");
        for (char c : maxChars) {
            System.out.println(c + " (" + maxFrequency + ")");
        }
    }
}