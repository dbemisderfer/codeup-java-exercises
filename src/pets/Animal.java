package pets;

import java.util.Arrays;
import java.util.Date;

public class Animal {
    public String eyeColor;
    public int age;
    public int weight;
    public String species;
    public Date birthdate;
    public String name;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.birthdate = new Date();
    }

//    public String getName() {
//        return name;
//    }

//    public int getWeight() {
//        return weight;
//    }

    public Animal() {

    }

    public void sleep() {
        System.out.println("Zzzz...Zzzzz...Zzzzzz.");
    }

    public void eat(String food) {
        System.out.printf("Nom, nom, nom. The %s lb. %s eats the %s.%n", this.weight, this.species, food);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(Arrays.toString(numbers));
//        Animal animal = new Animal("Howdy", 6);
//        Animal cat4 = new Cat("Tabby", 5);
//        animal.eat();
//        animal.sleep();
//        pets.Animal.eat();
//        Animal.sleep();
//        cat4.eat("catfood");
//
    }
}
