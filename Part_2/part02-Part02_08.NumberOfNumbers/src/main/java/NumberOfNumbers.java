
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayac = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number != 0){
                sayac++;
                continue;
            }
            if(number == 0){
                break;
            }
        }
        System.out.println("Number of numbers: " + sayac);

    }
}
