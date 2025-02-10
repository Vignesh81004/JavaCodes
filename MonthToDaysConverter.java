import java.util.Scanner;

public class MonthToDaysConverter {
    public static void main(String[] args) {
        Scanner input_046 = new Scanner(System.in);

        System.out.print("Enter the name of the month (e.g., January, February, etc.): ");
        String monthName_046 = input_046.nextLine();

        int days_046 = getDaysInMonth_046(monthName_046);
        if (days_046 != -1) {
            System.out.println("Number of days in " + monthName_046 + ": " + days_046);
        } else {
            System.out.println("Invalid month name. Please enter a valid month name.");
        }

        input_046.close();
    }

    private static int getDaysInMonth_046(String monthName_046) {
        String month_046 = monthName_046.toLowerCase();

        switch (month_046) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "april":
            case "june":
            case "september":
            case "november":
                return 30;
            case "february":
                return 28;
            default:
                return -1; // Invalid month name
        }
    }
}
