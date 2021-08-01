package day9.Task2;

public class Circle extends Figure{
    private int circleRadius;

    public Circle(int circleRadius,String color) {
        super(color);
        this.circleRadius = circleRadius;
    }

    @Override
    public double area() {
        return (circleRadius*circleRadius)*3.14;
    }

    @Override
    public double perimeter() {

        return 2*Math.PI*circleRadius;
    }
}
