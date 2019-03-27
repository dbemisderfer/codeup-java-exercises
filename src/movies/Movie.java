package movies;

public class Movie {
    private static String name;
    private static String category;

    public Movie(String movieName, String movieCategory) {
    this.name = movieName;
    this.category = movieCategory;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String newName) {
        Movie.name = newName;
    }

    public static String getCategory() {
        return category;
    }

    public static void setCategory(String newCategory) {
        Movie.category = newCategory;
    }

    public static void main(String[] args) {

    }
}
