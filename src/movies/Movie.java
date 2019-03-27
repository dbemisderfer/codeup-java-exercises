package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

//    public String getMovie(String scifi) {
//        Movie[] movieArray = MoviesArray.findAll();
//        for (Movie movie : movieArray) {
////            System.out.println(movie[0]); // returns memory location
////            System.out.println(Arrays.toString(movie));
////            System.out.println(movie.getName());
////            System.out.println(movie.getCategory());
//            if (movie.getCategory().equals("scifi")) {
//                System.out.println(movie.getName());
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Movie movie1 = new Movie("Hello", "drama");
//    }


}
