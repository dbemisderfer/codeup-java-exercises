package contacts;
import util.Input;
public class ContactsManager {
    static Input input;

    public static void addContact() {
        System.out.println("Enter first name: ");
        String placeholder = input.getString();
        String firstName = input.getString();
        System.out.println("Enter last name: ");
        String lastName = input.getString();
        System.out.println("Enter phone number: ");
        String phoneNum = input.getString();
        System.out.printf("%s %s %s%n", firstName, lastName, phoneNum);
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
                addContact();
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
