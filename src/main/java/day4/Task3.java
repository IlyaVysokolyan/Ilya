package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] array = new int[12][8];
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                array[i][i]= random.nextInt(50);
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


    }
}
