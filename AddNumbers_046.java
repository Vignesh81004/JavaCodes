import java.util.Scanner;

public class AddNumbers_046 {
    public static void main(String args[]) {
        Scanner input_046 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1_046 = input_046.nextInt();
        System.out.print("Enter the second number: ");
        int num2_046 = input_046.nextInt();
        input_046.close();

        System.out.println("Sum of two numbers: " + add_046(num1_046, num2_046));
    }

    public static int add_046(int x, int y) {
        int sum_046 = x + y;
        if (sum_046 > 105 && sum_046 < 200) {
            sum_046 = 200;
            System.out.println("Sum is between 105 and 200");
        }
        return sum_046;
    }
}
