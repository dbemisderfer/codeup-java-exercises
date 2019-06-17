import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExercises {

    /////////////////////////////////////////////
    //////////// Removing Elements //////////////
    /////////////////////////////////////////////
    // Take an array and remove every second element out of that array. Always keep
    // the first element and start removing with the next element.

    private static String [] words = {"keep", "remove", "keep", "remove", "keep"};

    public List<String> removeElements(String [] array) {
        List<String> newArray = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                newArray.add(array[i]);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        ArrayExercises test = new ArrayExercises();
        System.out.println(test.removeElements(words));

    }
}
