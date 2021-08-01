package day8;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        String str =" ";
        long start = System.currentTimeMillis();
        for(int i=0;i<=20000;i++){System.out.print(" "+i);}
        long finish = System.currentTimeMillis()-start;



        long start2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(" ");
        for(int i =0;i<=20000;i++){ System.out.print(stringBuilder.toString()+i);}
        long finish2  = System.currentTimeMillis()-start2;


        System.out.println();
        System.out.println("Str = "+finish+" мс");
        System.out.println("StringBuilder = "+finish2+" мс");





    }
}
