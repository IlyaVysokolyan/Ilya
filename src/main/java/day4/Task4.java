package day4;


import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        int max = 0;
        int sumIndex=0;


        for(int i=0;i<array.length;i++){
            array[i]= random.nextInt(10000);
            System.out.print(array[i]+" | ");
        }
        for(int i=0;i<array.length-2;i++){
            int currentSum =0;
            for(int j=i;j<i+3;j++){
                currentSum+=array[j];
                if(currentSum>max){
                    max=currentSum;
                    sumIndex=i;
                }
            }
        }


        System.out.println();
        System.out.println("Максимальная сумма тройки: "+max);
        System.out.println("Первый индекс тройки "+sumIndex);


    }
}
