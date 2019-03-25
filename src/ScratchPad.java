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
//        Scanner readinput = new Scanner(System.in);
//
//        String enterkey = "Hola";
//        System.out.print(enterkey);
//
//
//        enterkey = readinput.nextLine();
//        System.out.print(enterkey);
//
//        if (enterkey.equals("")) {
//
//            System.out.println("It works!");
//
//        }
//
//        class Student {
////        public static int studentCount = 0;
////        String name;
////        int age;
////
////        Student(String studentName, int studentAge) {
////            studentCount++;
////            this.name = studentName;
////            this.age = studentAge;
////        }

        System.out.println(multiplyWithoutStar(7, 9));
        System.out.println(recursionMultiplication(7, 9));

        }

    public static long multiplyWithoutStar(int num1, int num2) {
        long result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        return result;
    }


    public static long recursionMultiplication(int num1, int num2) {
        if (num2 == 1) {
            return num1;
        }
        return num1 + recursionMultiplication(num1, num2 - 1);
    }

    }


