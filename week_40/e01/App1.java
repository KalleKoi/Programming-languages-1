
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scanner.nextLine();

    if (name.equals("Louis")){
        System.out.println("Are you French?"); 
    
    } else {
        System.out.println("You have a great name!");
        }        
    }    
}
