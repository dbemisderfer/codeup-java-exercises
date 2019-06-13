import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SandboxPushups {

//    public static void fibo(int n1, int n2, int length, int count) {
//
//        if (count < length) {
//            int newNumber = n1 + n2;
//            System.out.print(newNumber + " ");
////            System.out.print(-(newNumber) + " ");
//            fibo(n2, newNumber, length, ++count);
//        }
//    }
    public static boolean findThePalindrome(String word) {

        StringBuffer reverse = new StringBuffer(word).reverse();
        return word.equalsIgnoreCase(reverse.toString());
//        if (testWord.equalsIgnoreCase(reverse)) {
//            return true;
//        }
//        return false;


//        boolean test = false;
//        char[] wordArray = {};
//        char[] reverseWordArray = {};
//        wordArray = word.toCharArray();
////        reverseWordArray = wordArray
//        return wordArray.length;

    }

    public static void main(String[] args) {

        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        for (int[] row : array) {
            for (int n : row) {
                System.out.print(n);
            }
            System.out.println();
        }

//        System.out.print("0 1 ");
//        fibo(0, 1, 10, 2)
//        System.out.print("0 ");
//        fibo(-1, 0, 11, 2);
        System.out.println(findThePalindrome("hello"));

//        String word = "hello";
//        String reverse = new StringBuffer(word).reverse().toString();
//        System.out.println(reverse);
//        String word = "hello";
//        char[] wordArray = {};
//        char[] reverseWordArray = {};
//        wordArray = word.toCharArray();
//        List<Character> array = new ArrayList<>();
//        for (char x : wordArray) {
//            array.add(x);
//        }
//        Collections.reverse(array);
//        System.out.println(array);
//        System.out.println(wordArray);
//        reverseWordArray = wordArray

//        System.out.println(findThePalindrome("hello"));

    }

}
