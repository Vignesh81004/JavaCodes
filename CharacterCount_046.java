import java.util.Scanner;

public class CharacterCount_046 {
    public static void main(String[] args) {
        Scanner input_046 = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word_046 = input_046.next();
        input_046.close();

        int letters_046 = 0;
        int digits_046 = 0;

        for (char c_046 : word_046.toCharArray()) {
            if (Character.isLetter(c_046)) {
                letters_046++;
            } else if (Character.isDigit(c_046)) {
                digits_046++;
            }
        }

        System.out.println("Letters = " + letters_046);
        System.out.println("Digits = " + digits_046);
    }
}
