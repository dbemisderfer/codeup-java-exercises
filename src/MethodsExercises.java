import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

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
//    Random Stuff I Found    /////////////
///////////////////////////////////////////

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static long getPower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    private static long factorial(int n)
    {
        if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }

///////////////////////////////////////////
//    2. Validate User Input   ////////////
///////////////////////////////////////////

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        do {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            userNumber = scanner.nextInt();
        } while (userNumber < min || userNumber > max);


        return userNumber;
    }




/////////////////////////////////////////////////////
/////////////////////////////////////////////////////
/////////////////////////////////////////////////////


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


        getInteger(1, 10);



///////////////////////////////////////////
//    3. Factorial of a Number    /////////
///////////////////////////////////////////
//        boolean keepGoing = true;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please enter a number between 1 and 10: ");
//            int num = scanner.nextInt();
//            if (num < 1 || num > 10) {
//
//            };
//            long result = 1;
////        System.out.println(num);
//            for (int i = 1; i <= num; i++) {
//
//                result *= i;
////            System.out.println(i);
////            System.out.printf("%d! = %d  = %d", i, i, i);
//            }
//            System.out.println(result);
//            System.out.println();
//            System.out.println("Would you like to keep going? [y/n]");
//            String userResponse = scanner.next();
//            if (userResponse.equalsIgnoreCase("n")) {
//                keepGoing = false;
//            }
//        } while (keepGoing);


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
}
