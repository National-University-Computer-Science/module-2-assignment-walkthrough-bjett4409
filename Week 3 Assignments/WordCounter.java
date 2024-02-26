public class WordCounter {

    /**
     * Finds the position of the next blank character in a String.
     * If none exists, the length of the string is returned.
     * @param str string containing characters to search
     * @param from character position where the search starts
     * @return character position of the next blank character
     */
    
     // This is the first signature in accordance with the homework assignment
     public static int nextSpacePosition(String str, int from) {
        int pos = str.indexOf(' ', from);
        return pos == -1 ? str.length() : pos;
    }

    /**
     * Finds the position of the next non-blank character in a String.
     * If none exists, the length of the string is returned.
     * @param str string containing characters to search
     * @param from character position where the search starts
     * @return character position of the next non-blank character
     */
    
    // This is the second signature in accordance with the homework assignment
     public static int nextNonSpacePosition(String str, int from) {
        int pos = from;
        while (pos < str.length() && str.charAt(pos) == ' ') {
            pos++;
        }
        return pos;
    }

    /**
     * Count the number of words in a given string.
     * A word is a sequence of characters separated by any number of spaces.
     * @param str string to count words in
     * @return number of words in str
     */
    
    // This is the third signature in accordance with the homework assignment
     public static int countWords(String str) { // The introduction of count Words string
        int count = 0;
        int pos = 0;

        while (pos < str.length()) {
            pos = nextNonSpacePosition(str, pos);
            if (pos < str.length()) {
                count++;
                pos = nextSpacePosition(str, pos);
            }
        }

        return count; // At the end of the if-while command it will return you a total count.
    }

    public static void main(String[] args) {
        String[] testStrings = {
            "WordCount", // word with no spaces
            "JavaScript Programming", // Phrase with one space between each
            " Week Three  Assignment test to include  additional characters. " // Phrase with multiple words and multiple spaces between words
        };       

        for (String testStr : testStrings) {
            System.out.println("The word count in \"" + testStr + "\" is: " + countWords(testStr));
        }
    }
}