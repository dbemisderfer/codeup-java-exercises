package shapes;

public class Square extends Quadrilateral {

    public Square(double length) {
        super(length, length);
    }

    public void setLength() {
        this.length = length;
    }

    public void setWidth() {
        this.width = width;
    }

    public double getArea() {
        return (this.length * this.length);
    }

    public double getPerimeter() {
        return (4 * this.length);
    }

    //public class Square extends Rectangle {

////    protected int side;   // If using "side" as a variable in the "get" methods below
//
//    public Square(int side) {
//        super(side, side);
////        this.side = side;  // If using "side" as a variable in the "get" methods below
//
//    }
//
//    public int getArea() {
//        return (this.length * this.length);
////        return (side * side);
//    }
//
//    public int getPerimeter() {
//        return 4 * this.length;
////        return 4 * side;
//    }

    public static void main(String[] args) {

    }
}
