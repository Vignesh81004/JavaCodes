import java.util.Scanner;

public class NumberPattern_046 {
    public static void main(String args[]) {
        Scanner input_046 = new Scanner(System.in);
        System.out.print("Enter a number for creating the pattern: ");
        int num_046 = input_046.nextInt();
        input_046.close();

        System.out.println();
        for (int i = num_046; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
