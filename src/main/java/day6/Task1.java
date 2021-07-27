package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2010);
        car.setColor("Blue");
        car.setModel("BMW");

        Motorbike motorbike = new Motorbike(2012,"Red","BMW");

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2021));
        System.out.println(motorbike.yearDifference(2021));
    }
}

