package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        byte m=12, n=8, strId=0;
        int sum=0, max=0;
        Byte [][] array = new Byte [m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array[i][j] = (byte)random.nextInt(50);
                sum+=array[i][j];
                //System.out.print(array[i][j]+" | ");
            }
            //System.out.println();
            if(sum>max){
                max=sum;
                sum=0;
                strId=(byte) i;
            }else sum=0;
        }
        //System.out.println(max +" <--------Сумма чисел в строке");
        System.out.println(strId+" <--------Номер (индекс) строки");
    }
}

