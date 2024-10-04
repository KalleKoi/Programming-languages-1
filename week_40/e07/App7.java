import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasNumber = false;

            System.out.println("Enter password: ");
            String password = scanner.nextLine();


            for(char x : password.toCharArray()){
                if(Character.isUpperCase(x)){
                    hasUpperCase = true;
                }
                if(Character.isDigit(x)){
                    hasNumber = true;
                }
                if(Character.isLowerCase(x)){
                    hasLowerCase = true;
                }
            }
            if((password.length()>=8) && hasUpperCase && hasNumber && hasLowerCase){
                System.out.println("Password is valid");
                break;
            }
            System.out.println("Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter.");
        }

    }
}