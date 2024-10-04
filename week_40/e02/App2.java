
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        for (int i = 0; i < name.length(); i++){
            System.out.println((name.charAt(i)));
        }
    }    
}
