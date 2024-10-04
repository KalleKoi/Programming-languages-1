
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word");
    String original = scanner.nextLine();
    String reversed = "";
    String input = "";


    for(int i = 0; i < original.length(); i++){
        if(Character.isAlphabetic(original.charAt(i))){
        reversed = original.charAt(i) + reversed;
        input = input + original.charAt(i);
        }
    }
    if(input.equalsIgnoreCase(reversed)){
        System.out.println(original + " is a palindrome");
    } else {
        System.out.println(original + " is not a palindrome");
        }
    }
}