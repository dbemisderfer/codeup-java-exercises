package util;
import java.util.Scanner;

public class Input {
//    private static String scanner;
    private String scanner;

    public String getString() {

    }

    public boolean yesNo(String userInput) {
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
        int output;
        Scanner scan = new Scanner(System.in);
        while(!scan.hasNextInt()) {
            System.out.printf("Sorry, that is not a valid entry. Please enter an integer between %d and %d: ", min, max);
            scan.next();
        }
        output = scan.nextInt();
        if (output < min || output > max) {
            System.out.printf("Sorry that is not within the range of %d and %d. Please enter a valid integer: ", min, max);
            return getInt(min, max);
        }
        return output;

    }

    public int getInt() {

    }

    public double getDouble(double minimum, double maximum) {
        int result;
        Scanner scanman = new Scanner(System.in);
        while(!scanman.hasNextInt()) {
            System.out.printf("I'm sorry, that is not a valid entry. Please enter an integer between %d and %d: ", minimum, maximum);
            scanman.next();
        }
        result = scanman.nextInt();
        if (result < minimum || result > maximum) {
            System.out.printf("Sorry that is not within the range of %d and %d. Please enter a valid integer: ", minimum, maximum);
            return getDouble(minimum, maximum);
        }
        return result;
    }

    public double getDouble() {

    }
}
