import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] oldPeople, Person newPerson) {
        Person[] newPeople;
//        newPeople = new Person[oldPeople.length + 1]; // alternate to adding length in below line
        newPeople = Arrays.copyOf(oldPeople, oldPeople.length + 1);
        newPeople[newPeople.length - 1] = newPerson;
        return newPeople;


    }
//    public static Array[] addPerson(Array[] array, Object person) {
//        return Array[];
//    }

//    public static Array[] addPerson(Person array[], Person person) {
//        return Array[];
//    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));
//        Person p1 = new Person("Teresa");
//        Person p2 = new Person("Alexis");
//        Person p3 = new Person("Noah");
//
//        Person[] people = {p1, p2, p3};
//        System.out.println(p1.getName());

        Person[] people = new Person[3];
        people[0] = new Person("Teresa");
        people[1] = new Person("Alexis");
        people[2] = new Person("Noah");
//        System.out.println(people[0].name); //won't work because of private
        System.out.println(people[1].getName()); //will work with private
        for (Person person : people) {
            System.out.println(person.getName());
        }
//        System.out.println(people[0]);

        Person[] morePeople = addPerson(people, new Person("Wally"));
        for (Person person : morePeople) {
            System.out.println(person.getName());
        }

//        System.out.println(addPerson(people,));







    }
}
