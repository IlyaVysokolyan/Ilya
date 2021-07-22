package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x ;
        double y ;
        while (true){
            y=scanner.nextDouble();
            if((x = scanner.nextDouble())==0) {
                System.out.println("Деление на 0 ");
                break;
            }else System.out.println(y/x);

        }

    }
}
