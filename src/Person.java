public class Person {
    private String name;

//    // constructor
//    public Person(String personName) {
//        name = personName;
//    }

    // returns the person's name
    public String getName() {
        return String.format("Person's name is: %s", name);
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello from %s%n", name);
    }

    // constructor
    public Person(String personName) {
        name = personName;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Dwight");
        Person p2 = p1;
        System.out.println(p1.getName());
        p1.setName("Dummy");
        p1.sayHello();
        p2.sayHello();
        System.out.println(p1);
        System.out.println(p2);



    }
}
