package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] array = new int[size];
        int count8=0;
        int count1=0;
        int countChetnie=0;
        int countNechetnie=0;
        int sum=0;
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(10);
        }
        for(Integer a:array){
            System.out.println(a+" ");
            if(a>8) count8++;
            if(a==1) count1++;
            if(a%2==0) {
                countChetnie++;
            }
            else countNechetnie++;
            sum+=a;
        }

        System.out.println("Длина массива: "+array.length);
        System.out.println("Количество чисел больше 8: "+count8);
        System.out.println("Количество чисел равных 1: "+count1);
        System.out.println("Количество четных чисел: "+countChetnie);
        System.out.println("Количество нечетных чисел: "+countNechetnie);
        System.out.println("Сумма всех элементов массива: "+sum);

    }
}
