package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
//        System.out.print("Please enter a word: ");
        return scanner.nextLine();
    }


//    public boolean yesNo() {
//        System.out.print("Enter 'y' or 'yes' to continue (otherwise the program will end).");
//        return scanner.next().equalsIgnoreCase("y") || scanner.next().equalsIgnoreCase("yes");
//    }

//    public boolean yesNo() {
//        System.out.print("Enter 'y' or 'yes' to continue (otherwise the program will end).");
//        boolean response = (scanner.next().equalsIgnoreCase("y")) ? true : false;
//        return response;
//    }

    public boolean yesNo() {
//        System.out.print("Enter 'y' or 'yes' to continue (otherwise the program will end).");
        String response = scanner.next();
        return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes");
    }

    public int getInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        scanner.next(); //// necessary so no infinite loop
        return getInt();
    }

    public int getInt (int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        scanner.next();
        return getInt(min, max);
    }

//    public int getInt (int min, int max) {
////        System.out.printf("Please enter a number between %d and %d: ", min, max);
//        return MethodsExercises.getInteger(min, max);
//
//    }


//    public int getInt () {
////        System.out.print("Please enter a number: ");
//        return scanner.nextInt();
//    }


    public double getDouble() {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        }
        scanner.next(); //// necessary so no infinite loop
        return getDouble();
    }

    public double getDouble (double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }
        scanner.next();
        return getDouble(min, max);
    }

//    public double getDouble(double min, double max) {
////        System.out.printf("Please enter a decimal number between %.2f and %.2f: ", min, max);
//        return MethodsExercises.getDecimalInteger(min, max);
//    }
//
//
//    public double getDouble() {
////        System.out.print("Please enter a decimal number: ");
//        return scanner.nextDouble();
//    }
}
