package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2019,"Синий","BMW");
        System.out.println("Модель мотоцикла: " +motorbike.getModel()+
                " ,год выпуска: "+motorbike.getYear()+
                " , цвет: "+motorbike.getColor());
    }
}
