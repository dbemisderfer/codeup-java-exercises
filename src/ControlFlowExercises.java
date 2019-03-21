import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Loop Basics
//
//        While
//
//        Create an integer variable i with a value of 5.

//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


//
//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);


//        For
//
//        refactor the previous two exercises to use a for loop instead

//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(i);
//            }
//        }



//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

//        Scanner scanner = new Scanner(System.in);
//        boolean confirmation = true;
//        do {
//            System.out.print("What number would you like to go up to? ");
//            int userNumber = scanner.nextInt();
////        System.out.println(userNumber);
//            System.out.println();
//            System.out.println("Here is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
////            for (int i = 1; i <= userNumber; i++) {
////
////                System.out.println("" + i + "      | " + i*i + "       | " + i*i*i);
////            }
//            for (int i = 1; i <= userNumber; i++) {
//                int numberSquared = i*i;
//                int numberCubed = i*i*i;
//                System.out.format("%-6d | %-7d | %-6d%n", i, numberSquared, numberCubed);
//            }
//            System.out.println("\n");
//            System.out.println("Would you like to continue? [y/n] ");
//            String random = scanner.nextLine();
//            String userInput = scanner.next();
//            if (userInput.equals("n")) {
//                confirmation = false;
//            }
//        } while (confirmation);






//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        boolean confirmation = true;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter a numerical grade from 0 to 100: ");
//            int userNumberGrade = scanner.nextInt();
//            System.out.println();
////        System.out.println(userNumberGrade);
//            if ((userNumberGrade >= 88) && (userNumberGrade <= 100)) {
//                System.out.println("A");
//            } else if ((userNumberGrade >= 80) && (userNumberGrade <= 87)) {
//                System.out.println("B");
//            } else if ((userNumberGrade >= 67) && (userNumberGrade <= 79)) {
//                System.out.println("C");
//            } else if ((userNumberGrade >= 60) && (userNumberGrade <= 66)) {
//                System.out.println("D");
//            } else if ((userNumberGrade >= 0) && (userNumberGrade <= 59)) {
//                System.out.println("F");
//            } else {
//                System.out.println("Incorrect entry. Please try again.");
//            }
//            System.out.println();
//            System.out.println("Would you like to continue? [y/n]");
//            String random = scanner.nextLine();
//            String userInput = scanner.next();
//            System.out.println();
//            if (userInput.equals("n")) {
//                confirmation = false;
//            }
//        } while (confirmation);



//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
        boolean confirmation = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your grade (w/o percentage) here: ");
            int userNumberGrade = scanner.nextInt();
//            System.out.println();
//            System.out.println(userNumberGrade);
            System.out.println();
            if ((userNumberGrade >= 99) && (userNumberGrade <= 100)) {
                System.out.println("Congratulations, you scored an A+!!!");
            } else if ((userNumberGrade >= 94) && (userNumberGrade <= 98)) {
                System.out.println("Great job, you got an A!!");
            } else if ((userNumberGrade >= 90) && (userNumberGrade <= 93)) {
                System.out.println("Nice work, that's an A-!");
            } else if ((userNumberGrade >= 88) && (userNumberGrade <= 89)) {
                System.out.println("Nice, that's a B+.");
            } else if ((userNumberGrade >= 84) && (userNumberGrade <= 87)) {
                System.out.println("Not bad, that's a B.");
            } else if ((userNumberGrade >= 80) && (userNumberGrade <= 83)) {
                System.out.println("Not too bad, that's a B-.");
            } else if ((userNumberGrade >= 78) && (userNumberGrade <= 79)) {
                System.out.println("Well, you at least got a C+.");
            } else if ((userNumberGrade >= 74) && (userNumberGrade <= 77)) {
                System.out.println("Hey, it could be worse...you got a C.");
            } else if ((userNumberGrade >= 70) && (userNumberGrade <= 73)) {
                System.out.println("You barely passed with a C-.");
            } else if ((userNumberGrade >= 68) && (userNumberGrade <= 69)) {
                System.out.println("Yikes, you got a D+!");
            } else if ((userNumberGrade >= 64) && (userNumberGrade <= 67)) {
                System.out.println("So sorry...you got a D.");
            } else if ((userNumberGrade >= 60) && (userNumberGrade <= 63)) {
                System.out.println("Ouch! You got a D-.");
            } else if ((userNumberGrade >= 0) && (userNumberGrade <= 59)) {
                System.out.println("Woah...dude. You failed with an F.");
            } else {
                System.out.println("Incorrect entry. Please try again.");
            }
            System.out.println();
            System.out.print("Would you like to continue? [y/n]");
            System.out.println();
            String userResponse = scanner.next();
            System.out.println("\n");
            if (userResponse.equalsIgnoreCase("n")) {
                confirmation = false;
            }

        } while (confirmation);

    }
}
