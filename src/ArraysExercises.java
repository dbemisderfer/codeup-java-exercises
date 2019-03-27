import java.util.Arrays;

public class ArraysExercises {
    public static addPerson() {
        return;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person p1 = new Person("Teresa");
        Person p2 = new Person("Alexis");
        Person p3 = new Person("Noah");

        Person[] people = {p1, p2, p3};
        for (Person person : people) {
            System.out.println(person.getName());
        }
//        System.out.println(p1.getName());






    }
}
