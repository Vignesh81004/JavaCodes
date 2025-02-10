import java.util.Scanner;

public class ReverseWord{
    public static void main(String[] args) {
        Scanner input_046 = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word_046 = input_046.nextLine();

        String reversedWord_046 = reverseString_046(word_046);
        System.out.println("Reversed word: " + reversedWord_046);

        input_046.close();
    }

    private static String reverseString_046(String input_046) {
        StringBuilder reversed_046 = new StringBuilder(input_046);
        return reversed_046.reverse().toString();
    }
}
