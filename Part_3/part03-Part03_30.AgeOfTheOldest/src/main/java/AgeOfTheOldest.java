
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest=0;
        while(true){
            String x = scanner.nextLine();
            if(x.equals("")){
                break;
            }
            String[] text = x.split(",");
            if(oldest < Integer.valueOf(text[1])){
                oldest = Integer.valueOf(text[1]);
            }
            
        }
        System.out.println("Age of the oldest: " + oldest);


    }
}
