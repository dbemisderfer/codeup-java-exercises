import java.lang.reflect.Array;
class CustomException extends Exception {}
public class ScratchPadExceptions {

    public static void dangerMethod() throws CustomException {
        System.out.printf("Aaaaaaah!!%n");
        throw new CustomException();
//        String[] words = {"one", "two", "three"};
//        System.out.println(words[1000]);
    }

    public static void main(String[] args) {
        System.out.printf("Here we are at the beginning of our program!%n");
        String[] words = {"one", "two", "three"};
        int i = 3;
        try {
//            if (i < 0 || i >= words.length) {
//                throw new Exception("Array index was erroneous!!!");
//            }
            System.out.printf("Here we are in the danger zone!!%n");
            System.out.printf(words[i]);
        } catch (ArrayIndexOutOfBoundsException ex) { //put more specific exceptions first!!!!
            System.out.printf("We are catching the built in exception.%n");
            System.out.println(ex);
        } catch (Exception e) { //put most general exception last!!!!
            System.out.printf("We are catching our own exceptions.%n");
            System.out.println(e);
        } finally {
            System.out.printf("We should always get here.%n");
        }
        System.out.println("Here we are at the end of our program!");

        try {
            dangerMethod();
        } catch (CustomException ce) {
            System.out.printf("Here we are.");
        }
    }

}
