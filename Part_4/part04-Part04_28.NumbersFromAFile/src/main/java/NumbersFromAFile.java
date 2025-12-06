
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList<String> numbers = new ArrayList<>();
        int count = 0;
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                numbers.add(line);                
            }
            for(int i =0; i < numbers.size();i++){
                int value = Integer.valueOf(numbers.get(i));
                if(value >= lowerBound && value <= upperBound){
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
