
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String answer=scanner.nextLine();
            if(answer.isEmpty()){
                break;
            }
            String[] words = answer.split(" ");
            for(String x:words){
                if(x.contains("av")){
                    System.out.println(x);
                }
            }
        }


    }
}
