package pets;

import java.util.Arrays;

public class Cat extends Animal {
//    public String name;

    public Cat(String name, int weight) {
//        this.name = name;
        super(name, weight);
        this.species = "cat";
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void sleep() {
        System.out.println("Mice.....Mmmmmmmm, yummy.");
    }

    public void eat(String food) {
        System.out.printf("Meow, meow. %s eats the %s.%n", name, food);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kitty", 6);
//        Animal cat2 = new Animal("Henry", 5);
//        Animal cat3 = new Cat("Boots", 4);
        Cat cat_x = new Cat("Willy", 4);
        Cat cat_y = new Cat("Sam", 5);
        Cat[] cats = {cat, cat_x, cat_y};
//        System.out.println(Arrays.toString(cats));
        for (Cat kat : cats) {
            System.out.println("Name: " + kat.getName());
            System.out.println("Weight: " + kat.getWeight());
        }

//        cat.sleep();             // Cat method
//        cat.eat("hotdog"); // Cat method
//        System.out.println();
//        Cat.eat("tuna");
//        Cat.sleep();
//        cat2.species = "cat";
//        cat2.weight = 5;
//        cat2.sleep();               // Animal method
//        cat2.eat("mackerel"); // Animal method
//        System.out.println();
//        pets.Animal.eat("canary");
//        cat2.eat("fish");
//        cat3.sleep();               // Animal method (when static)
//        cat3.eat("mouse");     // Cat method


//
    }
}
