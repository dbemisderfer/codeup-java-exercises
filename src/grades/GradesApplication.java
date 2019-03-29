package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
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
        System.out.println(student3.getGradeAverage());
        students.put("jgomez6", student1);
        students.put("hmorales", student2);
        students.put("cjimenez", student3);
        students.put("mtjuarez", student4);
        System.out.println(students);
    }
}
