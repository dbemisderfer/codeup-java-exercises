package movies;
import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public String output;

//    public static void getMovieCategory(Movie[] movieArray, int userSelection) {
//
//        if (userSelection == 5) {
//            for (Movie movie : movieArray) {
//                if (movie.getCategory().equals("scifi")) {
//                    System.out.println(movie.getName());
//                }
//            }
//
//        } else if (userSelection == 4) {
//            for (Movie movie : movieArray) {
//                if (movie.getCategory().equals("horror")) {
//                    System.out.println(movie.getName());
//                }
//            }
//        } else if (userSelection == 3){
//            for (Movie movie : movieArray) {
//                if (movie.getCategory().equals("drama")) {
//                    System.out.println(movie.getName());
//                }
//            }
//        } else if (userSelection == 2) {
//            for (Movie movie : movieArray) {
//                if (movie.getCategory().equals("animated")) {
//                    System.out.println(movie.getName());
//                }
//            }
//        } else if (userSelection == 1) {
//            for (Movie movie : movieArray) {
//                System.out.println(movie.getName() + " -- " + movie.getCategory());
//            }
//        }
//    }

    public static void getAllMovies() {
        Movie[] movieArray = MoviesArray.findAll();
        for (Movie movie : movieArray) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void getMovieFromCategory(String category) {
        Movie[] movieArray = MoviesArray.findAll();
        for (Movie movie : movieArray) {
            if (movie.getCategory().equals(category)) {
                System.out.println(movie.getName());
            }
        }
    }



    public static void main(String[] args) {
//        System.out.println(MoviesArray.findAll());
//        Movie movie2 = new Movie("Goodbye", "drama");
//        System.out.println(Arrays.toString(MoviesArray.findAll()));
//        for (Movie movie : MoviesArray.findAll()) {
//            System.out.println(movie);
//        }
//        Movie[] movieArray = MoviesArray.findAll();
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
//        System.out.println("Select a number between 0 and 5");
        Input input = new Input();
//        boolean userResponse = true;
//        getMovieCategory(movieArray, selectionNum);
        Scanner scanner = new Scanner(System.in);

        while(true) {
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: ");
        int selectionNum = input.getInt();

        switch(selectionNum) {
            case 0:
                System.out.println("Sayonara!");
                return;
//                break;
            case 1:
                getAllMovies();
                break;
            case 2:
                getMovieFromCategory("animated");
                break;
            case 3:
                getMovieFromCategory("drama");
                break;
            case 4:
                getMovieFromCategory("horror");
                break;
            case 5:
                getMovieFromCategory("scifi");
                break;
            default:
                break;
        }

//        System.out.println("\n");
//        System.out.println("Would you like to continue? [y/n]: ");
//        userResponse = input.yesNo();
        }

//////////////////////////////////////
/////// ALTERNATE WHILE LOOP /////////
//////////////////////////////////////
//        while (true) {
//            System.out.println("Would you like to continue? [y/n]: ");
//            if (input.yesNo()) continue;
//            else break;
//        }

    }
}
