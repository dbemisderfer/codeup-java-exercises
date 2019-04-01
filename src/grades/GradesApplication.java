package grades;

import java.lang.reflect.Array;
import java.util.*;

import util.Input;

public class GradesApplication {
    static Input input;
    static Map<String, Student> students; //Use interface type rather than the implementer
    static String userUsernameResponse;

    public static void getStudentInfo() {
        System.out.printf("Github Username: %s%n", userUsernameResponse);
        System.out.printf("Name: %s%n", students.get(userUsernameResponse).getName());
        System.out.print("Individual Grades: ");
        students.get(userUsernameResponse).getAllGrades();
        System.out.printf("Current Average: %s%n", students.get(userUsernameResponse).getGradeAverage());
    }

    public static void main(String[] args) {
        input = new Input();
        Set usernamesArray;
        students = new HashMap<>();
        Student student1 = new Student("Jose");
        student1.addGrade(88);
        student1.addGrade(90);
        student1.addGrade(97);
        Student student2 = new Student("Hinojosa");
        student2.addGrade(75);
        student2.addGrade(80);
        student2.addGrade(81);
        Student student3 = new Student("Carlos");
        student3.addGrade(71);
        student3.addGrade(91);
        student3.addGrade(100);
        Student student4 = new Student("Maria");
        student4.addGrade(85);
        student4.addGrade(97);
        student4.addGrade(93);
//        System.out.printf("Grade average: %s%n", student2.getGradeAverage());
        usernamesArray = students.keySet();
        students.put("jgomez6", student1);
        students.put("hmorales" , student2);
        students.put("cjimenez", student3);
        students.put("mtjuarez", student4);
//        student1.getAllGrades();  // List of all grades for student1
//        System.out.println("True/False: " + students.containsKey("hmorales"));
//        System.out.printf("Name of student is: %s%n", student2.getName());
//        System.out.printf("Array of usernames: %s%n", usernamesArray);
//        student1.getAllGrades();
        System.out.println("Welcome!\n");
        System.out.println("Would you like to see:");
        System.out.println("1 - Individual student grades/averages");
        System.out.println("2 - All student grades");
        System.out.println("3 - Class average");
        System.out.println("Here are the github usernames of our students:\n");
        for (Object username : usernamesArray) {
            System.out.printf("|%s| ", username);
        }
        System.out.println();
        for (Object username : usernamesArray) {
            System.out.printf("%s: ", username);
            students.get(username).getAllGrades();
        }
//        while(true) {
//            System.out.printf("%nWhat student would you like to see more information on? ");
//            userUsernameResponse = input.getString();
//            System.out.println();
//            if (!usernamesArray.contains(userUsernameResponse)) {
//                System.out.printf("Sorry, no student found with the github username of \"%s\".", userUsernameResponse);
//                System.out.println();
//            } else {
//                getStudentInfo();
//            }
//            System.out.printf("%nWould you like to see another student? [y/n] ");
////            boolean userContinues = input.yesNo();
//            if(input.yesNo()) {
//                input.getString();
//                continue;
//            } else {
//                System.out.printf("%nGoodbye, and have a wonderful day!");
//                break;
//            }
//
//        }




    }
}
