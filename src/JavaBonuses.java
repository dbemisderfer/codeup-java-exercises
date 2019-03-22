import java.util.Scanner;

public class JavaBonuses {
    public static void main(String[] args) {
//        Here are a few bonuses:
//        1) create three variables, start, end, and sum. Use a loop to find the summation of all the numbers between start and end (inclusive)
        boolean confirmation = true;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Please enter a starting number: ");
            int start = scanner.nextInt();
            int restart = start;
            System.out.println();
            System.out.println("Please enter an ending number: ");
            int end = scanner.nextInt();
            int sum = 0;
            while (start <= end) {
                sum += start;
                start++;
            }
            System.out.println();
            System.out.printf("The sum of all numbers from %d to %d is: %d", restart, end, sum);
            System.out.println("\n");
            System.out.println();
            System.out.println();
            System.out.println("Would you like to continue? [y/n]");
            String userInput = scanner.next();
            if (userInput.equalsIgnoreCase("n")) {
                confirmation = false;
            }

        } while (confirmation);











//    int endNum = 6;
//    int sum = 0;
//    for (int startNum = 2; startNum <= endNum; startNum++) {
//        sum = sum + startNum;
////        System.out.println(sum);
//    }
//        System.out.println(sum);

//        2) write a loop which will output all the prime numbers (evenly divisible by only 1 and themselves) between 10 and 10000


//        3) output a table representing the binary representations of the powers of 2
//        decimal       |       binary
//        1     |     00000001
//        2     |     00000010
//        4     |     00000100 (edited)
    }
}
