
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter numbers: ");
        while(true){
            int answer = Integer.valueOf(scanner.nextLine());
            if(answer == -1){
                break;
            }            
            statistics.addNumber(answer);
            if(answer %2 == 0){
                even.addNumber(answer);
            }
            if(answer %2 != 0){
                odd.addNumber(answer);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
