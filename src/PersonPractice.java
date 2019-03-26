public class PersonPractice {
    private String name;

    // returns the person's name
    public String getName() {
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("%s says 'hello'!", name);
    }

    public PersonPractice (String personName) {
        name = personName;
    }


    public static void main(String[] args) {
        PersonPractice p1 = new PersonPractice("Harold");
        System.out.println(p1.getName());
        p1.setName("Harry");
        p1.sayHello();
    }


}
