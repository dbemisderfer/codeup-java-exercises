public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools bt1 = new BurgerTools("mayo", 60, 360);
//        System.out.println(bt1.mostPopularTopping);
//        System.out.println(bt1.averageDaysBeforeExpiration);
//        System.out.println(bt1.temperatureWhenCooked);
        System.out.println(bt1.getTopping());
        bt1.setTopping("mustard");
        System.out.println(bt1.getTopping());

        bt1.grill();
    }
}
