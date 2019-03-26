import java.util.Scanner;
import java.lang.Math;

@SuppressWarnings("Duplicates")
public class MethodsExercises {

    public static void main(String[] args) {

///////////////////////////////////////////
//    1. Calling Arithmetic Methods    ////
///////////////////////////////////////////

//        System.out.println(addition(3, 4));
//        System.out.println(subtraction(6, 2));
//        System.out.println(multiplication(2, 5));
//        System.out.println(division(9, 3));
//        System.out.println(modulus(12, 4));
//        count(100);
//        System.out.println(getPower(2, 3));
//        System.out.println("Please enter a number");
//        System.out.println(factorial(1));


///////////////////////////////////////////
//    2. Validate User Input   ////////////
///////////////////////////////////////////


//        getInteger(1, 10);



///////////////////////////////////////////
//    3. Factorial of a Number    /////////
///////////////////////////////////////////


//        boolean keepGoing = true;
//        do {
//            System.out.printf("The factorial of that number is: %d.%n", factorial(getInteger(1, 20)));
//            System.out.println();
//            System.out.println("Would you like to continue? [y/n]");
//            Scanner scanner = new Scanner(System.in);
//            String userContinue = scanner.next();
//            System.out.println();
//            if (userContinue.equalsIgnoreCase("n") || userContinue.equalsIgnoreCase("no")) {
//                keepGoing = false;
//            }
//        } while (keepGoing);

    Scanner scanner = new Scanner(System.in);

    factorialUserInterface(scanner);

////////////////////////////////////
///////// First draft //////////////
////////////////////////////////////
//        boolean keepGoing = true;
////        do {
////            Scanner scanner = new Scanner(System.in);
//////            System.out.println("Please enter a number between 1 and 10: ");
//////            int num = scanner.nextInt(getInteger(1, 10));
//////            int num = scanner.nextInt();
//////            if (num < 1 || num > 10) {
//////
//////            };
//////            long result = 1;
////////        System.out.println(num);
//////            for (int i = 1; i <= num; i++) {
//////
//////                result *= i;
////////            System.out.println(i);
////////            System.out.printf("%d! = %d  = %d", i, i, i);
//////            }
////            System.out.println(factorial(getInteger(1,10)));
////            System.out.println(result);
////            System.out.println();
////            System.out.println("Would you like to keep going? [y/n]");
////            String userResponse = scanner.next();
////            if (userResponse.equalsIgnoreCase("n")) {
////                keepGoing = false;
////            }
////        } while (keepGoing);



//        Scanner scnr = new Scanner(System.in);
//        String userContinue;
//        do {
//            System.out.println(factorial(getInteger(1,10)));
//            System.out.println("Do you wish to continue?");
//            userContinue = scnr.next();
//        } while (userContinue.equalsIgnoreCase("yes"));


///////////////////////////////////////////
//    4. Dice Rolling Exercise    /////////
///////////////////////////////////////////

//        boolean keepGoing = true;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Please enter the number of sides you would like for your pair of dice: ");
//            int diceSides = scanner.nextInt();
//            int dice1 = (int) (Math.random()*diceSides + 1);
//            int dice2 = (int) (Math.random()*diceSides + 1);
//            System.out.println("Roll the dice!");
//            String rollDice = scanner.next();
//            System.out.printf("You rolled a %d and a %d%n", dice1, dice2);
//            System.out.println();
//        } while (keepGoing);

//
//        random() method returns a random number between 0.0 and 0.9...,
//        you multiply it by 6, so upper limit becomes 0.0 to 5.999...
//        when you add 1, it becomes 1.0 to 6.999..., now when you
//        truncate to int, you get 1 to 6.


///////////////////////////////////////////
//    5. Game Development 101    //////////
///////////////////////////////////////////



    }


/////////////////////////////////////////////////////
//////////////////////////////////////////////////////
///////////////////////////////////////////////////////
///////////// METHODS METHODS METHODS //////////////////////
///////////////////////////////////////////////////////
//////////////////////////////////////////////////////
/////////////////////////////////////////////////////


///////////////////////////////////////////
//    1. Basic Arithmetic    //////////////
///////////////////////////////////////////

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }


///////////////////////////////////////////
//    2. Validate User Input   ////////////
///////////////////////////////////////////

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Please enter a number between %d and %d (inclusive): ", min, max);

        if (!scanner.hasNextInt()) {
            String userString = scanner.next();
            System.out.println();
            System.out.printf("Sorry, %s is not a valid entry.%n", userString);
            System.out.println();
            System.out.printf("Please enter a number between %d and %d (inclusive): ", min, max);
            System.out.println();
            return getInteger(min, max);
        }

//        if (scanner.next().isEmpty()) {
//            System.out.println();
//            System.out.println("Sorry, you must enter something.");
//            return getInteger(min, max);
//        }

        int userNumber = scanner.nextInt();
        System.out.println();
        if (userNumber < min) {
            System.out.printf("Sorry, that number is too small. Please stay within the range of %d to %d.%n", min, max);
            System.out.println();
            System.out.printf("Please enter a number between %d and %d (inclusive): ", min, max);
            System.out.println();
            return getInteger(min, max);
        } else if (userNumber > max) {
            System.out.printf("Sorry, that number is too big. Please stay within the range of %d to %d.%n", min, max);
            System.out.println();
            System.out.printf("Please enter a number between %d and %d (inclusive): ", min, max);
            System.out.println();
            return getInteger(min, max);
        } else {
            return userNumber;
        }


    }

////////////////////////////////////
///////// Second draft //////////////
////////////////////////////////////
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        int userInput;
//        do {
//            System.out.printf("Enter a number between %d and %d: ", min, max);
//            while(!scanner.hasNextInt()) {
//                String stringEntered = scanner.next();
//                System.out.printf("%s is not a number%n", stringEntered);
//                System.out.printf("Enter a number between %d and %d: ", min, max);
//            }
//            userInput = scanner.nextInt();
//        } while (userInput < min || userInput > max);
//
//
//        return userInput;
//    }

////////////////////////////////////
///////// First draft //////////////
////////////////////////////////////
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        int userInput;
//        do {
//            System.out.printf("Enter a number between %d and %d: ", min, max);
//
//            userInput = scanner.nextInt();
//        } while (userInput < min || userInput > max);
//
//
//        return userInput;
//    }
//
//
//

///////////////////////////////////////////
//    3. Factorial of a Number    /////////
///////////////////////////////////////////
//    public static long factorial(int num) {
//        long result = 1;
//        for (int i = 1; i <= num; i++) {
//
//            result *= i;
////            System.out.println(i);
////            System.out.printf("%d! = %d  = %d", i, i, i);
//        }
//        return result;
//    }

    public static long recursionFactorial(int num) {

        if (num == 1) {
            return 1;
        }

        return num * recursionFactorial(num - 1);
    }


    public static void factorialUserInterface(Scanner scanner) {

        boolean keepGoing = true;
        do {
            System.out.printf("Please enter a number between 1 and 16 (inclusive): ");
            int userInput = getInteger(1, 16);
            System.out.printf("The factorial of that number is: %d.%n", recursionFactorial(userInput));
            System.out.println();
            System.out.println("Would you like to continue? [y/n]");
//            Scanner scanner = new Scanner(System.in);
            String userContinue = scanner.next();
            System.out.println();
            if (userContinue.equalsIgnoreCase("n") || userContinue.equalsIgnoreCase("no")) {
                keepGoing = false;
            }
        } while (keepGoing);
    }


///////////////////////////////////////////
//    Random Stuff I Found    /////////////
///////////////////////////////////////////

//    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }
//
//    public static long getPower(int base, int exponent) {
//        long result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result = result * base;
//        }
//        return result;
//    }

//    private static long factorial(int n)
//    {
//        if (n == 1)
//            return 1;
//        else
//            return n * factorial(n-1);
//    }


}
