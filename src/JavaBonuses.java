import java.util.Scanner;

public class JavaBonuses {
    public static void main(String[] args) {
//        Here are a few bonuses:
//        1) create three variables, start, end, and sum. Use a loop to find the
//        summation of all the numbers between start and end (inclusive)

//        boolean confirmation = true;
        Scanner scanner = new Scanner(System.in);
//        do {
//
//            System.out.println("Please enter a starting number: ");
//            int start = scanner.nextInt();
//            int restart = start;
//            System.out.println();
//            System.out.println("Please enter an ending number: ");
//            int end = scanner.nextInt();
//            int sum = 0;
//            while (start <= end) {
//                sum += start;
//                start++;
//            }
//            System.out.println();
//            System.out.printf("The sum of all numbers from %d to %d is: %d", restart, end, sum);
//            System.out.println("\n");
//            System.out.println();
//            System.out.println();
//            System.out.println("Would you like to continue? [y/n]");
//            String userInput = scanner.next();
//            if (userInput.equalsIgnoreCase("n")) {
//                confirmation = false;
//            }
//
//        } while (confirmation);



////////////////////////////////////
//// Alternate solution: Sabita ////
////////////////////////////////////

//        int end ;
//        int start ;
//        int sum=0;
//        System.out.println("enter the start number");
//        start=scanner.nextInt();
//        System.out.println("enter the end number");
//        end=scanner.nextInt();
//        for (int i = start; i <= end; i++) {
//            sum = sum + i;
//
//        }
//
//        System.out.println("Sum of the number is: "+sum);


//////////////////////////////////////
//      Initial Failed Attempt      //
//////////////////////////////////////
//    int endNum = 6;
//    int sum = 0;
//    for (int startNum = 2; startNum <= endNum; startNum++) {
//        sum = sum + startNum;
////        System.out.println(sum);
//    }
//        System.out.println(sum);





//        2) write a loop which will output all the prime numbers (evenly divisible
//        by only 1 and themselves) between 10 and 10000

        for (int i = 10; i <= 100; i++) {
            for (int j = 2; j <= 7; j++) {
                if ((i % j != 0) && (i % i == 0)){
                    System.out.println(i);
                }
//                switch (i) {
//                    case (i % j = 0):
//                        continue;
//                    case (i % i = 0):
//                        System.out.println(i);
//                        continue;
//                    default:
//                        break;
//                }
            }

        }


//        3) output a table representing the binary representations of the powers of 2
//
//        decimal       |       binary
//        1     |     00000001
//        2     |     00000010
//        4     |     00000100 (edited)






//        You’ll be creating a text based RPG in your console!
//–	Allow user to input their hero name.
//–	Ask if they are ready to start. If yes, then start the game.
//–	Give a display of enemy stats and hero stats. These values can be assigned by you.
//–	Decide on what actions your hero can take.
//–	For example:
//        1.	Attack (each time 1 is input, enemy health should decrease)
//        2.	Drink potion (adds to hero health.)
//        3.	Run? (ends the game)
//–	Keep asking for user input until the enemy health reaches 0, then end the game.
//                **BONUS:
//–	allow user to input enemy name.
//–	have the enemy attack the hero to decrease heroHealth after each time the hero takes an action
//–	if heroHealth reaches 0 before the enemy’s end game with message “Game Over.”
//–	Indicate how many potions your hero starts with. Decrement each time this action is used.
//
//        ~ Have fun and get creative!~
//                Collapse
//
//
//
//
//:smug-pac:
//        1
//
//:rubberducky:
//        1
//
//:rob:
//        1
//
//:discoparrot:
//        1


    }
}
