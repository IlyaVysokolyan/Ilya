package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[100];
        int count0 =0;
        int sum0=0;
        for(int i =0;i<array.length;i++) array[i]=random.nextInt(10000);
        int max = array[0];
        int min = array[0];
        for(Integer a:array){
            if(max<a)  max=a;
            if(min>a) min=a;
            if(a%10==0){
                count0++;
                sum0+=a;
            }
           // System.out.println(a+" ");
        }
        System.out.println(max+ " -наибольший элемент массива");
        System.out.println(min+" -наименьший элемент массива");
        System.out.println(count0+" -количество элементов массива, оканчивающихся на 0");
        System.out.println(sum0+" -сумму элементов массива, оканчивающихся на 0");

    }
}
