public class BurgerTools {
    private static String mostPopularTopping;
    private static int averageDaysBeforeExpiration;
    private static int temperatureWhenCooked;

    public void grill() {
        System.out.println("Grilling burger");
    }

    public String getTopping() {
        return this.mostPopularTopping;
    }

    public void setTopping(String newTopping) {
        this.mostPopularTopping = newTopping;
    }

    public BurgerTools(String topping, int expires, int temp) {
        this.mostPopularTopping = topping;
        this.averageDaysBeforeExpiration = expires;
        this.temperatureWhenCooked = temp;

    }

}
//-- SHORT ASSIGNMENT #2 (part 1) --
//        Create a class of static properties and methods called BurgerTools
//        Include a string property of mostPopularTopping
//        Include an int property of averageDaysBeforeExpiration
//        Include an int property of temperatureWhenCooked
//        Include a void method called grill() that prints out "Grilling burger"
//        Create a class called BurgerTester to test assigning and printing property
//        values and testing methods.
//
//        If you have time, add additional properties and methods.
//
//
//
//
//        -- SHORT ASSIGNMENT #2 (part 2) --
//        Refactor your RestaurantDish and RestaurantTest classes...
//        1) Change your public properties in your RestaurantDish class to private
//        2) Add getters and setters for these properties (write them manually then
//        erase them and use IntelliJ to do this quickly)
//        3) Refactor code used in RestaurantTest to set and print these property
//        values...
//        ...to use your getters and setters
//        4) Add a constructor method to RestaurantDish that will assign property...
//        ...values based on arguments passed into the constructor