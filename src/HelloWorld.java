import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) { //args can be banana, if you want

//////////////////////////////////////
///////////// Console IO /////////////
//////////////////////////////////////

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your full name: ");
//        String userInput = scanner.nextLine(); //must use .nextLine (rather than .next) for any inputs with whitespace in between words!!!!!!!!!
//
//        System.out.format("Nice to meet you, %s!", userInput); //must use .format (rather than .print) for anything with %s



//////////////////////////////////////
//// Syntax, Types, and Variables ////
//////////////////////////////////////
//        int myFavoriteNumber = 16;
//        String myString = "hello";
//        myString = 'g';
//        myString = 3.14159;
//        long myNumber = 123;
//        float myNumber = 3.14f;
//        System.out.println(myNumber);
//        double myNumber = 3.14;


//        System.out.print(myNumber);
//        System.out.print("Hello,");
//        System.out.print(" World!");

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String class = "hello";
//
//        System.out.println(class);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(y);

//        byte numeral = 127;
//        numeral++;
//        numeral--;
//        System.out.println(numeral);

//        String message1 = "Goodbye";
//        int number1 = 44; //can use %s or %d with int
//
//        System.out.format("%s, John! I'm %d years old.\n\t", message1, number1);
//        System.out.format("%s, John! I'm %s years old.\n\t\t", message1, number1);
//        System.out.format("%s, John! I'm %s years old.\n", message1, number1);
//        System.out.format("%s, John!\n\t", message1);
//        System.out.format("%s, John!\n\t\t", message1);
//        System.out.format("%s, John!", message1);

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }

    }
}

// psvm TAB
// sout TAB
// CTRL + SHFT + R to run code