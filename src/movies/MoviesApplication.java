package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public String output;

    public static void getMovieCategory(Movie[] movieArray, int userSelection) {

        if (userSelection == 5) {
            for (Movie movie : movieArray) {
                if (movie.getCategory().equals("scifi")) {
                    System.out.println(movie.getName());
                }
            }

        } else if (userSelection == 4) {
            for (Movie movie : movieArray) {
                if (movie.getCategory().equals("horror")) {
                    System.out.println(movie.getName());
                }
            }
        } else if (userSelection == 3){
            for (Movie movie : movieArray) {
                if (movie.getCategory().equals("drama")) {
                    System.out.println(movie.getName());
                }
            }
        } else if (userSelection == 2) {
            for (Movie movie : movieArray) {
                if (movie.getCategory().equals("animated")) {
                    System.out.println(movie.getName());
                }
            }
        } else if (userSelection == 1) {
            for (Movie movie : movieArray) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(MoviesArray.findAll());
//        Movie movie2 = new Movie("Goodbye", "drama");
        System.out.println(Arrays.toString(MoviesArray.findAll()));
//        for (Movie movie : MoviesArray.findAll()) {
//            System.out.println(movie);
//        }
        Movie[] movieArray = MoviesArray.findAll();
////        for (int i = 0; i < movieArray.length; i++) {
////            System.out.println(movieArray[i].getName());
////            System.out.println(movieArray[i].getCategory());
////        }
//        for (Movie movie : movieArray) {
////            System.out.println(movie[0]); // returns memory location
////            System.out.println(Arrays.toString(movie));
////            System.out.println(movie.getName());
////            System.out.println(movie.getCategory());
//            if (movie.getCategory().equals("scifi")) {
//                System.out.println(movie.getName());
//            }
//
//        }
//        System.out.println(Arrays.toString(movieArray));
//        System.out.println(Arrays.toString());
//        System.out.println(getMovieCategory(movieArray, 5));
//        getMovieCategory(movieArray, 5));
        System.out.println("Select a number between 0 and 5");
        Input input = new Input();
        int selectionNum = input.getInt(0, 5);
        getMovieCategory(movieArray, selectionNum);
    }
}
