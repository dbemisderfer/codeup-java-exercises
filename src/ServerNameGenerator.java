import java.lang.reflect.Array;
import java.util.Arrays;

public class ServerNameGenerator {
    private static String randomNoun;
    private static String randomAdj;

    public static String randomElement(String array[]) {
        int x = (int) (Math.random() * (array.length));

        return array[x];
    }

//    public static String hyphenatedString(String str1, String str2) {
//        return
//    }

    public static void main(String[] args) {

        String[] adjectives = {
                "bright",
                "lovely",
                "moist",
                "balmy",
                "wild",
                "wonderful",
                "heavenly",
                "dim",
                "stupid",
                "clammy"
        };

        String[] nouns = {
                "dog",
                "cat",
                "human",
                "planet",
                "flower",
                "ocean",
                "fork",
                "truck",
                "mushroom",
                "pizza"
        };

        randomNoun = randomElement(nouns);
        randomAdj = randomElement(adjectives);
        System.out.printf("Here is your server name:%n%s-%s%n", randomAdj, randomNoun);
        System.out.println(Arrays.toString(nouns));


    }
}
