package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2019, 30, 1000);
        airplane.setYear(2020);
        airplane.setWeight(25);
        airplane.fillUp(2);
        airplane.fillUp(30);
        airplane.info();


    }
}
