
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = size; i > 0; i--) {
            printSpaces(i - 1);
            printStars(size - i + 1);
        }

    }

    public static void christmasTree(int height) {

        int row = 1;
        while (row <= height) {
            printSpaces(height - row);
            printStars(2 * row - 1);
            row++;
        }

        // Gövde
        int trunk = 0;
        while (trunk < 2) {
            printSpaces(height - 2);
            printStars(3);
            trunk++;

        }
    }
    

    

    public static void main(String[] args) {

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
