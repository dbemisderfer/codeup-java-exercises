import java.util.Scanner;

public class ScratchPadScanner {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();
//        userInput = scanner.next();


        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }

}
