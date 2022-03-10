package rectangle;

public class Rectangle {
    private final float length,breadth;


    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float Area() {
        return  length*breadth;

    }
}
