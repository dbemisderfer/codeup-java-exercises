import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        boolean keepGoing = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please start a conversation with Bob: ");
        do {
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println();
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println();
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println();
                System.out.println("Fine. Be that way!");
            } else if (userInput.equalsIgnoreCase("x")) {
                System.out.println("Later, dude.");
                keepGoing = false;
            } else {
                System.out.println("Whatever.\n");
            }
            System.out.println();
            System.out.println("Please continue the conversation (or enter 'x' to exit): ");
        } while (keepGoing);
        System.out.println("Bob is going to his room.");
    }
}
