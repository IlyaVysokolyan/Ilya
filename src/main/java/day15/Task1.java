package day15;

import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File(("src/main/resources/shoes.csv"));
        Scanner scanner;
        String[] str;
        int count;

        try {
            scanner = new Scanner(file);
            PrintWriter printWriter = new PrintWriter("src/main/resources/missing_shoes.txt");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                str = line.split(";");

                if (Integer.parseInt(str[2]) == 0) {
                    System.out.println(Arrays.toString(str));
                    printWriter.write(line + "\n");
                }


            }
            scanner.close();
            printWriter.close();


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!!!");
        }

    }
}
