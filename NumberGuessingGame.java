import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input_046 = new Scanner(System.in);
        Random random_046 = new Random();

        int targetNumber_046 = random_046.nextInt(9) + 1;
        int userGuess_046;

        System.out.println("Guess a number between 1 and 9:");

        while (true) {
            while (!input_046.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number between 1 and 9.");
                input_046.next(); // Clear the invalid input from the scanner
            }
            userGuess_046 = input_046.nextInt();

            if (userGuess_046 < 1 || userGuess_046 > 9) {
                System.out.println("Please enter a number between 1 and 9.");
            } else if (userGuess_046 < targetNumber_046) {
                System.out.println("Guessed too low. Try Again.");
            } else if (userGuess_046 > targetNumber_046) {
                System.out.println("Guessed too high. Try Again.");
            } else {
                System.out.println("Well guessed!");
                break;
            }

            System.out.print("Enter your guess: ");
        }

        input_046.close();
    }
}