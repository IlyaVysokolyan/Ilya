package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing1",2020,15,1000);
        Airplane airplane2 = new Airplane("Boing2",2021,17,2000);
        Airplane.compareAirplanes(airplane1,airplane2);

    }
}