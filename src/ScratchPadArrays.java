import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.fill;

public class ScratchPadArrays {

    public static void main(String[] args) {


///////////////////////////////
//    FOR LOOP    /////////////
///////////////////////////////
//        String[] languages = {"html", "css", "javascript", "java"};

//        for (int i = 0; i < languages.length; i += 1) {
//            System.out.println(languages[i]);
//        }

//        For Loop outputs...
//        html
//        css
//        javascript
//        java


///////////////////////////////
//    ENHANCED FOR LOOP    ////
///////////////////////////////
//        String[] languages = {"html", "css", "javascript", "java"};
////        void Arrays.fill(languages, "bologna");
//        String Arrays.toString(languages);
//
//        for (String language : languages) {
//            System.out.println(language);
//        }

//        Enhanced For Loop outputs...
//        html
//        css
//        javascript
//        java


///////////////////////////////
//  ENHANCED FOR LOOP (ALT)  //
///////////////////////////////
//        String[] languages = {"html", "css", "javascript", "java"};

//        for (String n : languages) {
//            System.out.println(n);
//        }

//        Enhanced For Loop (ALT) outputs...
//        html
//        css
//        javascript
//        java


//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//// access the first element in the second row
//        System.out.println(matrix[1][0]); // 4
//// the last element in the first row
//        System.out.println(matrix[0][2]); // 3
//// the first element in the last row
//        System.out.println(matrix[2][0]); // 7
//
//
//        for (int[] row : matrix) {
//            System.out.println("+---+---+---+");
//
//            System.out.print("| ");
//
//            for (int element : row) {
//                System.out.print(element + " | ");
//            }
//
//            System.out.println();
//        }
//
//        System.out.println("+---+---+---+");

        String[] seasons = new String[4];
        seasons[0] = "Spring";
        seasons[1] = "Summer";
        seasons[2] = "Autumn";
        seasons[3] = "Winter";

        String[] seasons2 = {
                "Spring",
                "Summer",
                "Autumn",
                "Winter"
        };

//        int[] phoneNumber = new int[7];
//
//        Arrays.fill(phoneNumber, 5);
//        int[] phoneNumber2 = Arrays.copyOf(phoneNumber, 8);
//        for (int digit : phoneNumber2) {
//            System.out.print(digit);
//        }
        System.out.println();
        System.out.println(Arrays.toString(seasons));
        for(String season : seasons) {
            System.out.println(season);
        }
//        Arrays.sort(seasons);
//        System.out.println(Arrays.toString(seasons));
//        System.out.println(Arrays.equals(seasons, seasons2)); //returns true or false
        List<String> stringList = new ArrayList<>();
        stringList.add("Spring");
        stringList.add("Summer");
        stringList.add("Autumn");
        stringList.add("Winter");
        System.out.println(stringList);
        for(String season : stringList) {
            System.out.println(season);
        }
////////////////////////////////////////////
/////////// FOR LOOP ON ArrayList //////////
////////////////////////////////////////////
//        for(int i = 0; i < stringList.size(); i++) {
//            System.out.println(stringList.get(i));
//        }

    }
}
