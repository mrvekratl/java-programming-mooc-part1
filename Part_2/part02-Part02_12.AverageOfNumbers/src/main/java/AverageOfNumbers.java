
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayac=0;
        int sum=0;
        while(true){
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            if(x !=0){
                sayac++;
                sum=sum+x;
                continue;
            }
            if(x==0){
                break;
            }            
        }
        double average = (double)sum/sayac;
        System.out.println("Average of the numbers: " + average);

    }
}
