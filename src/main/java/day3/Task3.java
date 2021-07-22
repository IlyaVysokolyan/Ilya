package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x ;
        double y ;
        for (int i=0;i<5;i++){
            y= scanner.nextDouble();
            if((x=scanner.nextDouble())==0){
                System.out.println("Деление на 0 ");
                continue;
            } System.out.println(y/x);
        }
    }
}
