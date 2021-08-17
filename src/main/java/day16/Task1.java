package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult(new File("Test.txt"));

    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String str = scanner.nextLine();
            String[] numb = str.split(" ");
            int n = 0;
            for (String s : numb) {
                n += Integer.parseInt(s);
            }
            System.out.print((double) n / numb.length + " --> ");
            System.out.printf("%.3f", (double) n / numb.length);
            scanner.close();


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!!!!");
        }
    }
}

