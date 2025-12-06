import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {        
        while (true) {
            System.out.print("Command: ");
            String answer = scanner.nextLine();
            
            if (answer.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (answer.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();                
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.dict.add(word, translation);
            } else if (answer.equals("search")) {
                System.out.print("To be translated: ");
                String query = scanner.nextLine();
                String translation = this.dict.translate(query);
                
                if (translation == null) {
                    System.out.println("Word " + query + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}