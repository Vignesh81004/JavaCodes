import java.util.Scanner;

public class PasswordValidator_046 {
    public static void main(String[] args) {
        Scanner input_046 = new Scanner(System.in);
        System.out.print("Enter a strong password (6 - 16): ");
        String password_046 = input_046.next();
        input_046.close();

        if (password_046.length() < 6 || password_046.length() > 16) {
            System.out.println("Invalid password length. Password must be between 6 and 16 characters.");
            System.exit(0);
        }

        if (isValidPassword_046(password_046)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
            System.out.println("Requirements:");
            System.out.println("- At least 1 lower case");
            System.out.println("- At least 1 upper case");
            System.out.println("- At least 1 digit");
            System.out.println("- At least 1 symbol (@ / # / $)");
        }
    }

    private static boolean isValidPassword_046(String password_046) {
        // Use regular expressions to check for requirements
        String lowercasePattern_046 = ".*[a-z].*";
        String uppercasePattern_046 = ".*[A-Z].*";
        String digitPattern_046 = ".*\\d.*";
        String symbolPattern_046 = ".*[@#$].*";

        return password_046.matches(lowercasePattern_046) &&
               password_046.matches(uppercasePattern_046) &&
               password_046.matches(digitPattern_046) &&
               password_046.matches(symbolPattern_046);
    }
}

