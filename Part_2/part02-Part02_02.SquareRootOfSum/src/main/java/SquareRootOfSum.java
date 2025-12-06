
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.valueOf(scanner.nextLine());
        int y = Integer.valueOf(scanner.nextLine());
        int z = x + y;
        double squareRoot = Math.sqrt(z);
        System.out.println(squareRoot);
    }
}
