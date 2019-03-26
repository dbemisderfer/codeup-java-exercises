package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double getRadius = input.getDouble();
        Circle c1 = new Circle(getRadius);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
    }

}
