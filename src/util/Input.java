package util;
import com.sun.javafx.fxml.expression.BinaryExpression;

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
//        String response = scanner.nextLine();
        return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes");
    }

//    public int getInt() { //old getInt method
//        if (scanner.hasNextInt()) {
//            return scanner.nextInt();
//        }
//        scanner.next(); //// necessary so no infinite loop
//        return getInt();
//    }

    public int getInt() {
        int returnInteger = 0;
        String userInput;
        userInput = scanner.nextLine();
        try {
            returnInteger = Integer.valueOf(userInput);
        } catch (NumberFormatException nfe) {
//            System.out.println(nfe);
            return getInt();
        }
        return returnInteger;
    }

//    public int getInt (int min, int max) { //old method
//        int userInt = getInt();
//        if (userInt >= min && userInt <= max) {
//            return userInt;
//        }
//        scanner.next();
//        return getInt(min, max);
//    }

    public int getInt (int min, int max) throws NumberFormatException {
        Integer userInt;
        String input = scanner.nextLine();
        try {
            userInt = Integer.valueOf(input);
        } catch (NumberFormatException nfe) {
            return getInt(min, max);
        }
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
//        scanner.next();
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


//    public double getDouble() {  // old getDouble method
//        if (scanner.hasNextDouble()) {
//            return scanner.nextDouble();
//        }
//        scanner.next(); //// necessary so no infinite loop
//        return getDouble();
//    }

        public double getDouble() {
        double returnDouble = 0;
        String userInput;
        userInput = scanner.nextLine();
        try {
            returnDouble = Double.valueOf(userInput);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
            return getDouble();
        }
        return returnDouble;
    }


    //    public double getDouble (double min, double max) {  // old method
//        double userDouble = getDouble();
//        if (userDouble >= min && userDouble <= max) {
//            return userDouble;
//        }
//        scanner.next();
//        return getDouble(min, max);
//    }

    public double getDouble (double min, double max) {
        Double userDouble;
        String input = scanner.nextLine();
        try {
            userDouble = Double.valueOf(input);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
            return getDouble(min, max);
        }
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

    public String giveHex() {
        String returnHex = "";
        int userInput;
        userInput = scanner.nextInt();
        try {
            returnHex = Integer.toHexString(userInput);
        } catch (Exception e) {
            System.out.println(e);
            return giveHex();
        }
        return returnHex;
    }

    public static void main(String[] args) {
        Input in = new Input();
    }
}
