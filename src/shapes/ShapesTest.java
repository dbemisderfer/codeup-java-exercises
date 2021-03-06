package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
        Measurable myShape1 = new Square(5.0);
        Measurable myShape2 = new Rectangle(4.0, 5.0);
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape1.getArea());
        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(((Square) myShape1).getLength()); // IntelliJ will automatically cast these as Square and
        System.out.println(((Square) myShape1).getWidth()); // Rectangle since they are Measurable at the moment,
        System.out.println(((Rectangle) myShape2).getLength()); // which doesn't have its own getLength
        System.out.println(((Rectangle) myShape2).getWidth()); // and getWidth methods.


    }
}
