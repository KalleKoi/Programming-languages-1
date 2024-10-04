import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String names = "";
        String input;

        while (true) {
            System.out.println("Enter a name (type quit to exit): ");
            input = scanner.nextLine();

            if(input.equalsIgnoreCase("Quit")) {
                break;
            }
        

        names = names.concat(input);
        System.out.println(names);
        }
    }
}
