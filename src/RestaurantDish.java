public class RestaurantDish {
    private int costInCents;
    private String nameOfDish = "Unnamed dish";
    private boolean wouldRecommend;
    public void eat() {
        System.out.println("Nom, nom, nom!");
    }

//    public RestaurantDish(int cost, String name, boolean recommend) {
//        this.costInCents = cost;
//        this.nameOfDish = name;
//        this.wouldRecommend = recommend;
//    }


    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostInCents() {
        return this.costInCents;
    }

    public void setCostInCents(int newCost) {
        this.costInCents = newCost;
    }

    public String getNameOfDish() {
        return this.nameOfDish;
    }

    public void setNameOfDish(String newNameOfDish) {
        this.nameOfDish = newNameOfDish;
    }

    public boolean getWouldRecommend () {
        return this.wouldRecommend;
    }

    public void setWouldRecommend(boolean newValue) {
        this.wouldRecommend = newValue;
    }



//    public static void main(String[] args) {
//        RestaurantDish dish = new RestaurantDish();
//        dish.costInCents = 99;
////        dish.nameOfDish = "Yummy Yum Sandwich";
//        dish.wouldRecommend = true;
//        dish.eat();
//
//        System.out.printf("%n%d %s %b",   //%b for boolean
//                dish.costInCents,
//                dish.nameOfDish,
//                dish.wouldRecommend);
////        System.out.println(dish.costInCents);
////        System.out.println(dish.nameOfDish);
////        System.out.println(dish.wouldRecommend);
////        System.out.println(RestaurantDish.eat()); //Only if a static method!!!
////        System.out.println(dish.eat());
////        System.out.println(eat());
//    }
}
