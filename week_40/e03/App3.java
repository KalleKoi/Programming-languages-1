import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();


        for (int i = name.length() - 1; i>=0; i--){
           System.out.println(name.charAt(i));
    
        }
    }
}
