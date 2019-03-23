import java.util.Scanner;
public class ScratchPad {

    public static void main(String[] args) {
//        Student dwight = new Student("Dwight", 99);
//        System.out.println(Student.studentCount);
//        System.out.println(dwight.name);
//        String str = "hello";
//        String stringnum = "6";
//        int num = 6;
//        String both = "str" + num;
//        System.out.println(both);
//
//        int x = 5 * 4 % 3;
//        System.out.println(x);
        Scanner readinput = new Scanner(System.in);

        String enterkey = "Hola";
        System.out.print(enterkey);


        enterkey = readinput.nextLine();
        System.out.print(enterkey);

        if (enterkey.equals("")) {

            System.out.println("It works!");

        }

        class Student {
//        public static int studentCount = 0;
//        String name;
//        int age;
//
//        Student(String studentName, int studentAge) {
//            studentCount++;
//            this.name = studentName;
//            this.age = studentAge;
//        }


        }


    }
}