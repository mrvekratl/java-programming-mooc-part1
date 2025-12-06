
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monster
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList todo;
    public UserInterface(TodoList todo, Scanner scanner){
        this.scanner=scanner;
        this.todo=todo;
    }
    public void start() {
        while(true){
            System.out.print("Command: ");
            String answer = scanner.nextLine();
            if(answer.equals("stop")){
                break;
            }else if(answer.equals("add")){
                System.out.print("To add: ");
                String addTask = scanner.nextLine();
                this.todo.add(addTask);
            }else if(answer.equals("list")){
                this.todo.print();
            }else if(answer.equals("remove")){
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                this.todo.remove(number);
            }
        }
    }
}
