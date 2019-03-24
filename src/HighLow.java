import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {

        ///////////////////////////////////////////
//    4. Dice Rolling Exercise    /////////
///////////////////////////////////////////

        boolean keepGoing = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the number of sides you would like for your pair of dice: ");
            int diceSides = scanner.nextInt();
            int dice1 = (int) (Math.random()*diceSides + 1);
            int dice2 = (int) (Math.random()*diceSides + 1);
            System.out.println("Roll the dice!");
            String rollDice = scanner.next();
            System.out.printf("You rolled a %d and a %d%n", dice1, dice2);
            System.out.println();
        } while (keepGoing);

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





}
