public class MidTerm {
    public static void main(String[] args) {
        int size = 10; // The height and base width of the largest triangle

        for (int i = 1; i <= size; i++) {
            
            String triangle1 = ""; // Triangle 1
            for (int j = 0; j < i; j++) {
                triangle1 += "*";
            }
            triangle1 += " ".repeat(size - i); // Triangle 1

            String triangle2 = "*".repeat(size - i + 1); // Triangle 2

            String triangle3; // Triangle 3
            int starsInTriangle3 = size - i + 1;
            triangle3 = (starsInTriangle3 < 8 ? " ".repeat(8) : "") + " ".repeat(i - 1) + "*".repeat(starsInTriangle3);

            String triangle4 = "*".repeat(i) + " ".repeat(size - i); // Triangle 4

            // Display all four triangles as an output on the screen
            System.out.println(triangle1 + "\t\t" + triangle2 + "\t\t" + triangle3 + "\t\t" + triangle4);
        }
    }
}