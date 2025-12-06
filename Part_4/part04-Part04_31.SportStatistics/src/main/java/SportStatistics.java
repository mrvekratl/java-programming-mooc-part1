
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int count=0;
        int wins =0;
        int loss=0;
        try (Scanner fileScan = new Scanner(Paths.get(file))) {

            while(fileScan.hasNextLine()){
                String lines = fileScan.nextLine();
                String[] words = lines.split(",");
                if(team.equals(words[0])){
                    count++;
                    if(Integer.valueOf(words[2]) > Integer.valueOf(words[3])){
                        wins++;
                    }else{
                        loss++;
                    }
                } else if (team.equals(words[1])) {
                    count++;
                    if (Integer.valueOf(words[3]) > Integer.valueOf(words[2])) {
                        wins++;
                    } else {
                        loss++;
                    }
                }
                
                
                     
            }            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loss);

    }

}
