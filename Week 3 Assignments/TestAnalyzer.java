public class TestAnalyzer {

    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.toLowerCase().trim().split("\\s+");
        return (int) java.util.Arrays.stream(words).distinct().count();
    }

    // Added method to count characters excluding spaces
    public static int countCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        return input.replace(" ", "").length();
    }

    public static int countUniqueWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return (int) java.util.Arrays.stream(words).distinct().count();
    }

    /**
    * Main method to demonstrate the analyzed text.
    *
    * @param args Command-line arguments, not used in this program
    *
	*/
    public static void main(String[] args) {
        String testString = "Hello world, hello Java. Hello again!";
        System.out.println("Character count (excluding spaces): " + countCharacters(testString));
        System.out.println("Word count (unique, ignoring case): " + countWords(testString));
        System.out.println("Unique word count (case-sensitive): " + countUniqueWords(testString));
    }
}
