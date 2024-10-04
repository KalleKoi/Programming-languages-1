import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        for (int i = 1; i < name.length(); i+=2) {
            System.out.println(name.charAt(i));

        }
    }
}