public class EvenDigitsNumbers_046 {
    public static void main(String[] args) {
        int start_046 = 100;
        int end_046 = 400;
        StringBuilder result_046 = new StringBuilder();

        for (int number_046 = start_046; number_046 <= end_046; number_046++) {
            if (areAllDigitsEven_046(number_046)) {
                result_046.append(number_046).append(", ");
            }
        }

        
        if (result_046.length() > 0) {
            result_046.delete(result_046.length() - 2, result_046.length());
        }

        System.out.println("Numbers with all even digits: " + result_046);
    }

    private static boolean areAllDigitsEven_046(int num_046) {
        String numStr_046 = String.valueOf(num_046);
        for (char digit_046 : numStr_046.toCharArray()) {
            int numValue_046 = digit_046 - '0'; 
            if (numValue_046 % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
