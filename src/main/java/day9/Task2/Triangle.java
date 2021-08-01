package day9.Task2;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class Triangle extends Figure{
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    public Triangle( int sideOne, int sideTwo, int sideThree,String color) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double area() {
        double p=(sideOne+sideTwo+sideThree)/2;
        return Math.sqrt((p*(p-sideThree)*(p-sideTwo)*(p-sideThree)));
    }

    @Override
    public double perimeter() {
        return sideOne+sideTwo+sideThree;
    }
}
