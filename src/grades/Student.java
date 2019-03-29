package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        int totalGrades = grades.size();
        for (Integer grade : grades) {
            sum += grade;
        }
        double finalGrade = sum / totalGrades;
        double roundedGrade = (double) Math.round(finalGrade * 100) / 100;
        return roundedGrade;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Larry");
//        System.out.println(student1.getName());
        student1.addGrade(92);
        student1.addGrade(100);
//        student1.addGrade(93);
        student1.addGrade(71);
        System.out.println(student1.grades);
        System.out.println(student1.getGradeAverage());

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
////        System.out.println(numbers);
//        double sum = 0;
//        for (Integer number : numbers) {
//            System.out.println(number);
//            sum += number;
//        }
//        System.out.println(sum);
    }

}

