package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2019);
        car.setColor("Синий");
        car.setModel("BMW X5");
        System.out.println("Модель авто: "+car.getModel()+" ,год выпуска: "+car.getYear()+" , цвет: "+car.getColor());

    }
}

