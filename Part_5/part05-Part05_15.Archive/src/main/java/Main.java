
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> identities = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identy = scanner.nextLine();
             if(identy.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
           if(name.isEmpty()){
                break;
            }
            if(!identities.contains(identy)){
                identities.add(identy);
                names.add(name);
            }
            
        }
        System.out.println("==Items==");
        for(int i = 0; i < names.size(); i++){
            System.out.println( identities.get(i)+": "+ names.get(i));
        }


    }
}
