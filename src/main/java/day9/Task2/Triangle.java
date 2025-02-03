package day9.Task2;

public class Triangle extends Figure{

    private double x;
    private double y;
    private double z;
    public Triangle(String color, double x, double y, double z) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double area() {
        double halfP = perimeter() / 2;
        return Math.sqrt(halfP * (halfP - x) * (halfP - y) * (halfP - z));
    }

    @Override
    public double perimeter() {
        return x + y + z;
    }
}
