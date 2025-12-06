
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index=0;
        String name="a";
        while(true){
            String text=scanner.nextLine();
            if(text.isEmpty()){
                break;
            }
            String[] words = text.split(",");
            if(index < Integer.valueOf(words[1])){
                index=Integer.valueOf(words[1]);
                name=words[0];
            }
            
        }
        System.out.println("Name of the oldest: " + name);


    }
}
