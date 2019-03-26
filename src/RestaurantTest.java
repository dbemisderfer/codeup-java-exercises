public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish(600, "Sandwich", false);
//        dish.costInCents = 99;
//        dish.nameOfDish = "Yummy Yum Sandwich";
//        dish.wouldRecommend = true;
        dish.setCostInCents(1000);
        System.out.println(dish.getCostInCents());
//        dish.setNameOfDish("Wonton Soup");
        System.out.println(dish.getNameOfDish());
        dish.setWouldRecommend(true);
        System.out.println(dish.getWouldRecommend());
        dish.eat();
        RestaurantDish dish2 = new RestaurantDish(500, "Hotdog", false);
//        System.out.println(dish.costInCents);
//        System.out.println(dish.nameOfDish);
//        System.out.println(dish.wouldRecommend);
//        System.out.println(RestaurantDish.eat()); //Only if a static method!!!
//        System.out.println(dish.eat());
        System.out.println(dish2.getCostInCents());

    }
}
