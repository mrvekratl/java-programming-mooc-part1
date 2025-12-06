
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum=0;
        double average=0;
        while(true){
            int x=Integer.valueOf(scanner.nextLine());
            if(x > 0){
                number++;
                sum = sum + x;
                continue;
            }
            if(x<0){
                continue;
            }
            if(x ==0){
                break;
            }
        }
        if(number == 0){
            System.out.println("Cannot calculate the average");
        }
        if(number >0){
            average = (double)sum/number;
            System.out.println(average);
        }

    }
}
