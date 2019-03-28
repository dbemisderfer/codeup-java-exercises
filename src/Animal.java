import java.util.Date;

public class Animal {
    public String eyeColor;
    public int age;
    public int weight;
    public String species;
    public Date birthdate;

    public Animal() {
        this.birthdate = new Date();
    }

    public void eat(String food) {
        System.out.printf("Nom, nom, nom. The %s eats the %s%n", this.species, food);
    }

    public static void sleep() {
        System.out.println("Zzzz...Zzzzz...Zzzzzz.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat4 = new Cat();
//        animal.eat();
        animal.sleep();
//        Animal.eat();
        Animal.sleep();
        cat4.eat("catfood");
//
    }
}
