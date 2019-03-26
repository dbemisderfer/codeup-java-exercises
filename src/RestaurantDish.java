public class RestaurantDish {
    public int costInCents;
    public String nameOfDish = "Unnamed dish";
    public boolean wouldRecommend;
    public void eat() {
        System.out.println("Nom, nom, nom!");
    }

    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 99;
//        dish.nameOfDish = "Yummy Yum Sandwich";
        dish.wouldRecommend = true;
        dish.eat();

        System.out.printf("%n%d %s %b",   //%b for boolean
                dish.costInCents,
                dish.nameOfDish,
                dish.wouldRecommend);
//        System.out.println(dish.costInCents);
//        System.out.println(dish.nameOfDish);
//        System.out.println(dish.wouldRecommend);
//        System.out.println(RestaurantDish.eat()); //Only if a static method!!!
//        System.out.println(dish.eat());
//        System.out.println(eat());
    }
}
