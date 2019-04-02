package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public double getArea() {
        return this.length * this.width;
    }

//    @Override
//    public void setLength(String key) {
//        this.length = length;
//    }

        public void setLength() {
        this.length = length;
    }

    public void setWidth() {
        this.width = width;
    }

    //    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
////    public Rectangle() {
////
////    }
//
//    public int getArea() {
//        return this.length * this.width;
//    }
//
//    public int getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }

    public static void main(String[] args) {
    }
}
