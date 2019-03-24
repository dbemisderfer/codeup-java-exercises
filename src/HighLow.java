import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {

///////////////////////////////////////////
//    4. Dice Rolling Exercise    /////////
///////////////////////////////////////////


//        boolean keepGoing = true;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Please enter the number of sides you would like for your pair of dice: ");
////            int diceSides = scanner.nextInt();
//            int diceSides = getInteger(1, 10);
//            int dice1 = (int) (Math.random()*diceSides + 1);
//            int dice2 = (int) (Math.random()*diceSides + 1);
////            System.out.println("Roll the dice!");
////            String rollDice = scanner.next();
//            System.out.println();
//            System.out.printf("You rolled a %d and a %d%n", dice1, dice2);
//            System.out.println();
//            System.out.println("Would you like to continue? [y/n]");
//            String userResponse = scanner.next();
//            System.out.println();
//            if ((userResponse.equalsIgnoreCase("n")) || (userResponse.equalsIgnoreCase("no"))) {
//                keepGoing = false;
//            }
//        } while (keepGoing);

//
//        random() method returns a random number between 0.0 and 0.9...,
//        you multiply it by 6, so upper limit becomes 0.0 to 5.999...
//        when you add 1, it becomes 1.0 to 6.999..., now when you
//        truncate to int, you get 1 to 6.


///////////////////////////////////////////
//    5. Game Development 101    //////////
///////////////////////////////////////////


        boolean keepGoing = true;
        do {
            Scanner scanner = new Scanner(System.in);
            int randomNumber = (int) (Math.random() * 100 + 1);
            System.out.println(randomNumber);
            System.out.println();
            System.out.println("Guess a number between 1 and 100.");
             do {
                int userGuess = getInteger(1, 100);
                if (userGuess < randomNumber) {
                    System.out.println("Sorry, the number is higher than that.");
                }
                if (userGuess > randomNumber) {
                    System.out.println("Sorry, the number is lower than that.");
                }
                if (userGuess == randomNumber) {
                    System.out.println("You guessed it!");
                    System.out.println();
                    break;
                }
            } while (keepGoing);

            System.out.println("Would you like to play again? [y/n]");
            String userResponse = scanner.next();
            if (userResponse.equalsIgnoreCase("n") || userResponse.equalsIgnoreCase("no")) {
                keepGoing = false;
            }
        } while (keepGoing);


    }

/////////////////////////////////////////////////////
//////////////////////////////////////////////////////
///////////////////////////////////////////////////////
///////////// METHODS METHODS METHODS //////////////////////
///////////////////////////////////////////////////////
//////////////////////////////////////////////////////
/////////////////////////////////////////////////////

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
}
