package contacts;
import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ContactsManager {
    static Input input;
    static String directory = "src/contacts/data";
    static String filename = "contactlist.txt";

    public static void addContact() throws IOException {
        System.out.println("Enter first name: ");
//        String placeholder = input.getString();
        String firstName = input.getString();
        System.out.println("Enter last name: ");
        String lastName = input.getString();
        System.out.println("Enter phone number: ");
        String phoneNum = input.getString();
        System.out.printf("%s %s %s%n", firstName, lastName, phoneNum);
        Path contactDirectory = Paths.get(directory);
        Path contactFile = Paths.get(directory, filename);
        if (Files.notExists(contactDirectory)) {
            Files.createDirectories(contactDirectory);
        }
        if (Files.notExists(contactFile)) {
            Files.createFile(contactFile);
        }
//        List<String> lines = Files.readAllLines()
        Files.write(
                Paths.get(directory, filename),
                Arrays.asList(firstName, lastName, phoneNum),
                StandardOpenOption.APPEND
        );
    }
    public static void main(String[] args) {
//        Contact contact1 = new Contact("Marty", "Henson", "1231231234");
//        System.out.printf("%s %s %s%n", contact1.getFirstName(), contact1.getLastName(), contact1.getPhone());
        input = new Input();

        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5): ");
        int choose = input.getInt();
        switch (choose) {
            case 1 :
                break;
            case 2 :
                try {
                    addContact();
            } catch (IOException ioe){
                    ioe.printStackTrace();
            }

                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
//                System.exit(0);
                return;
        }
    }
}
