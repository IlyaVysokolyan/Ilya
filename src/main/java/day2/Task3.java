package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a>b) System.out.println("Некорректный ввод");
        while (true){
            for(int i=a+1;i<b;i++){
                if(i%5==0 & i%10!=0){
                    System.out.print(i+" ");
                }

            }
            break;
        }
    }
}
