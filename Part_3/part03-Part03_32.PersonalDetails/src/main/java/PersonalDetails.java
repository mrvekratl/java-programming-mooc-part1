
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int count=0;
        String longest="";
        while(true){
            String user = scanner.nextLine();
            if(user.equals("")){
                break;
            }
            String[] list = user.split(",");
            String name = list[0];
            sum += Integer.valueOf(list[1]);
            count++;
            if(name.length()>longest.length()){
                longest=name;
            }         
                
        }
        double average = (double)sum / count;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);


    }
}
