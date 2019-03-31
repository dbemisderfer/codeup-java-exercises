package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Scanner;
import util.Input;

public class GradesApplication {
    static Input input;
    static HashMap<String, Student> students;
    static String userUsernameResponse;

    public static void getStudentInfo() {
        System.out.printf("Name: %s - Github Username: %s%n", students.get(userUsernameResponse).getName(), userUsernameResponse);
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
        System.out.printf("Grade average: %s%n", student2.getGradeAverage());
        usernamesArray = students.keySet();
        students.put("jgomez6", student1);
        students.put("hmorales" , student2);
        students.put("cjimenez", student3);
        students.put("mtjuarez", student4);
        System.out.println("True/False: " + students.containsKey("hmorales"));
        System.out.printf("Name of student is: %s%n", student2.getName());
        System.out.printf("Array of usernames: %s%n", usernamesArray);
        System.out.println("Welcome!\n");
        System.out.println("Here are the github usernames of our students:\n");
        for (Object username : usernamesArray) {
            System.out.printf("|%s| ", username);

        }
        System.out.println();
        System.out.println();
        while(true) {
            System.out.println("What student would you like to see more information on?");
            userUsernameResponse = input.getString();
            System.out.println();
            if (!usernamesArray.contains(userUsernameResponse)) {
                System.out.printf("Sorry, no student found with the github username of \"%s\"%n", userUsernameResponse);
            } else {
                getStudentInfo();
            }
            System.out.println("Would you like to see another student? [y/n]");
//            boolean userContinues = input.yesNo();
            if(input.yesNo()) {
                input.getString();
                continue;
            } else {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }

        }




    }
}
