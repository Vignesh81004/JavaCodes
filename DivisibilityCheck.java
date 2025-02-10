import java.util.Scanner;

public class DivisibilityCheck {

    public static void main(String args[]) {
        int num_046;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("To find if it is divisible by 5 and 8");
            System.out.print("Enter a number (1000 to 2000): ");
            num_046 = input.nextInt();
            
            if (num_046 < 1000) {
                System.out.println("Enter a number greater than 1000.");
            } else if (num_046 > 2000) {
                System.out.println("Enter a number less than 2000.");
            }
        } while (num_046 < 1000 || num_046 > 2000);
        
        input.close();

        if (num_046 % 8 == 0 && num_046 % 5 == 0) {
            System.out.println(num_046 + " is divisible by 5 and 8");
        } else if (num_046 % 5 == 0) {
            System.out.println(num_046 + " is only divisible by 5");
        } else if (num_046 % 8 == 0) {
            System.out.println(num_046 + " is only divisible by 8");
        } else {
            System.out.println(num_046 + " is not divisible by 5 or 8 or by both (5 and 8)");
        }
    }
}