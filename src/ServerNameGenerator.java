import java.lang.reflect.Array;
import java.util.Arrays;

public class ServerNameGenerator {
    private static String randomNoun;
    private static String randomAdj;

    public static String randomElement(String[] array) {
        int x = (int) (Math.random() * (array.length));

        return array[x];
    }

//    public static String hyphenatedString(String str1, String str2) {
//        return
//    }



    public static void main(String[] args) {
//////////////////////////////////////
//////////////////////////////////////
//   How to test for random number  //
//////////////////////////////////////
//////////////////////////////////////

        int max = 10; // You will never see this number (only 0-9)
        for (int i = 0; i < 100; i++) {
            int random = (int)(Math.random() * max);
            System.out.println(random);
        }


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
