import java.util.Scanner;
import java.lang.String;
//import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateConverter {
    public static void main(String[] args) {
//        Create a date format converter tool in a class called DateConverter.
//
//        Take in a string in the following format:
//
//        MM/DD/YYYY
//
//        Output the following:
//
//        MonthName DD, YYYY
//
//        Example:
//
//        input - 12/01/1999
//        output - December 12, 1999
//
//        Separate your logic into various methods, as needed.
//
//        As an extra challenge, use method overloading to take in an optional
//        boolean second argument that specifies if the date conversion should
//        happen in reverse (e.g. taking in "December 12, 1999" and outputting
//        "12/01/1999").



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a date in the MM/DD/YYYY format: ");
//        String userDate = scanner.next();
//        Date date = new Date(userDate);
//        String pattern = "MMMMM dd, yyyy";
//        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
//        String format = formatter.format(date);
//        System.out.println(format);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a date in the MM/DD/YYYY format: ");
        String userDate = scanner.next();
        System.out.println(dateConversion(userDate));



//        String pattern = "MM/dd/yyyy";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        System.out.print("Please enter a date in the MM/DD/YYYY format: ");


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a date in the MM/DD/YYYY format: ");
//        String date = scanner.next();
//        String[] dateComponents = date.split("/");
//        System.out.println(Arrays.toString(dateComponents));
//        String newDate = Arrays.toString(dateComponents).replaceAll("\\[|\\]|,|\\s", " ");
//        System.out.println(newDate);
//        String month = scanner.next();
//        String day = scanner.next();
//        String year = scanner.next();
//        System.out.printf("You entered %d / %d / %d, correct?", month, day, year);

    }

    public static String dateConversion(String userDate) {
        Date date = new Date(userDate);
        String pattern = "MMMMM dd, yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String format = formatter.format(date);
//        System.out.println(format);
        return format;
    }

}
