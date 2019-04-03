package contacts;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ContactsManager {
    static Input input;
    static String directory = "src/contacts/data";
    static String filename = "contacts.txt";
//    static String filename = "contactlist.txt";
    static Path dataDirectory = Paths.get(directory);
    static Path dataFile = Paths.get(directory, filename);
    static List<Contact> contacts = new ArrayList<>();
    static List<String> iocontacts = new ArrayList<>();

    public static void selectionMenu() {
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5): ");
        int choose = input.getInt();
        switch (choose) {
            case 1 :
                try {
                    viewAllContacts();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
                break;
            case 2 :
                try {
                    addContact();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }

                break;
            case 3 :
                try {
                    searchByName();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }

                break;
            case 4 :
                deleteContact();
                break;
            case 5 :
//                System.exit(0);
                return;
        }
    }

    public static void viewAllContacts() throws IOException {
        List<String> lines = Files.readAllLines(dataFile);
        System.out.println("Here is the contact list:");
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void addContact() throws IOException {
        System.out.println("Enter first name: ");
//        String placeholder = input.getString();
        String firstName = input.getString();
        System.out.println("Enter last name: ");
        String lastName = input.getString();
        System.out.println("Enter phone number: ");
        String phoneNum = input.getString();
        System.out.printf("%s %s %s%n", firstName, lastName, phoneNum);
        Contact newContact = new Contact(firstName, lastName, phoneNum);
        contacts.add(newContact);
        iocontacts.add(contacts.toString());
        System.out.println(iocontacts);
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
                iocontacts,
//                Arrays.asList(firstName, lastName, phoneNum),
                StandardOpenOption.APPEND
        );
    }

    public static void searchByName() throws IOException {
        System.out.println("Enter a name: ");
        String searchFor = input.getString();
//        System.out.println(searchFor);
        List<String> contacts = Files.readAllLines(dataFile);
        for(String contact : contacts){
//            System.out.println(contact);
            if(contact.startsWith(searchFor)){
                System.out.println(contact);
            }
        }
    }

    public static void deleteContact() {
        System.out.println();
    }
    public static void main(String[] args) {
//        Contact contact1 = new Contact("Marty", "Henson", "1231231234");
//        System.out.printf("%s %s %s%n", contact1.getFirstName(), contact1.getLastName(), contact1.getPhone());
        input = new Input();
        selectionMenu();

    }
}
