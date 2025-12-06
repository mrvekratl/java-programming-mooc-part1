
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayac=0;
        while(true){
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            if(x > 0){
                continue;
            }
            if(x<0){
                sayac++;
                continue;
            }
            if(x==0){
                break;
            }
        }
        System.out.println("Number of negative numbers: " + sayac);

    }
}
