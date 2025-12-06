import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            Book book = new Book(title, pages, year);
            list.add(book);         
                    
        }
        System.out.println("What information will be printed? ");
        String want = scanner.nextLine();
        if(want.equals("everything")){
            for(Book each : list){
                System.out.println(each.getEverything());
            }
        }
        if(want.equals("name")){
            for(Book each : list){
                System.out.println(each.getTitle());
            }
        }
        

    }
}
