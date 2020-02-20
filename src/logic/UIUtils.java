package logic;

import java.util.Scanner;

public class UIUtils {
    public static String readData(String message) {
        System.out.print(message);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int readNumber(String message) {
        int result = 0;

        boolean isDigit = false;

        do {
            try {
                result = Integer.parseInt(readData(message));

                isDigit = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please re enter again");
            }
        } while (!isDigit);

        return result;
    }
    public static void outputData (String message) {System.out.println(message);}

    public static void main(String[] args) {
        System.out.println("Current year is "+getCurrentYear());
    }

    public static int getCurrentYear()
    {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(java.util.Calendar.YEAR);
    }
}
