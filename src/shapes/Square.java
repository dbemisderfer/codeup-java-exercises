package shapes;

public class Square extends Rectangle {

//    protected int side;

    public Square(int side) {
        super(side, side);
//        this.side = side;

    }

    public int getArea() {
        return (this.length * this.length);
    }

    public int getPerimeter() {
        return 4 * this.length;
    }

    public static void main(String[] args) {

    }
}
