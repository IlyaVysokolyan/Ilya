package day14;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printSumDigits(new File("Test.txt"));

    }

    public static void printSumDigits(File file) {

        int iSum = 0;
        int count = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            for (String n : numbers) {
                iSum += Integer.parseInt(n);
                count++;
            }
            scanner.close();
            if (count != 10) {
                throw new NumberFormatException();
            } else System.out.println(iSum);
            scanner.close();


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
