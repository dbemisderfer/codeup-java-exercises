import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {


//////////////////////////////////////
///////////// Console IO /////////////
//////////////////////////////////////
//        double pi = 3.14159; // use %.2f for two decimal places
//        System.out.format("The value of pi is approximately %f %n", pi); //can use %n in place of \n for new lines

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int userInputNumber = scanner.nextInt();
//        System.out.format("Your number was %d.", userInputNumber); //use %d for integers

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter three separate words:");
////        System.out.println("Enter the first word: ");
//        String userInput1 = scanner.next();
////        System.out.println("Enter the second word: ");
//        String userInput2 = scanner.next();
////        System.out.println("Enter the third word: ");
//        String userInput3 = scanner.next();
////        System.out.println(userInput1 + "\n" + userInput2 + "\n" + userInput3);
//        System.out.println(userInput1);
//        System.out.println(userInput2);
//        System.out.println(userInput3);

//        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Enter a three-word sentence: ");
////        String userInput = scanner.nextLine();
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);
/////////////////////////// !!!! IMPORTANT !!!! /////////////////////
//        String random = scanner.nextLine(); // necessary if you're not commenting out previous lines
///////////////////////////////////////////////////////////

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a brief sentence: ");
////        String userSentence = scanner.next(); // Doesn't work with more than one word
//        String userSentence = scanner.nextLine();
//        System.out.printf("Your sentence was: %s", userSentence);
////        System.out.format("Here is the random variable: %s%n", random);



//        Scanner scanner = new Scanner(System.in);
///////////////// Attempt as using strings ////////////
//        System.out.println("Please enter length:");
//        double userLength = new Double(scanner.nextLine());
//        System.out.println("Please enter width:");
//        double userWidth = scanner.nextDouble();


//        String userLength = scanner.next();
//        String userWidth = scanner.nextLine();
//        int numLength = (int) userLength;
//        int numWidth = (int) userWidth;
///////////////////////////////////////////////////////

///////////////// Using integers //////////////////////
//        System.out.println("Please enter a length: ");
//        int userLength = scanner.nextInt();
//        System.out.println("Please enter a width: ");
//        int userWidth = scanner.nextInt();
///////////////////////////////////////////////////////

///////////////// Using decimals //////////////////////
        System.out.println("Please enter the length of the room, in decimal format: ");
        double userLength = scanner.nextDouble();
        System.out.println("Please enter the width of the room, in decimal format: ");
        double userWidth = scanner.nextDouble();
        System.out.println("Please enter the height of the room, in decimal format:");
        double userHeight = scanner.nextDouble();
///////////////////////////////////////////////////////

        System.out.format("You entered a length of %.2f, a width of %.2f, and a height of %.2f.\n", userLength, userWidth, userHeight);

//        System.out.println("The area is: " + (userLength*userWidth));
//        System.out.println("The perimeter is: " + (2*userLength + 2*userWidth));

        System.out.printf("The area of the room is %.2f square feet.%n", userLength*userWidth);
        System.out.printf("The perimeter of the room is %.2f feet.%n", 2*userLength + 2*userWidth);
        System.out.printf("The volume of the room is %.2f cubic feet.%n", userLength*userWidth*userHeight);




    }


}

// psvm TAB
// sout TAB
// CTRL + SHFT + R to run code