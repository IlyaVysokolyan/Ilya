package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter file1 = new PrintWriter("file1.txt");
        PrintWriter file2 = new PrintWriter("file2.txt");
        Random random = new Random();

        int count = 0;
        int sum = 0;
        //Запись в файл
        for (int i = 0; i < 1000; i++) {
            int rnd = random.nextInt(1000+ 1);
            file1.write(rnd + " ");
        }
        file1.close();


        File fullFile1 = new File("file1.txt");
        Scanner scanner1 = new Scanner(fullFile1);
        String line  = scanner1.nextLine();
        String [] numbers = line.split(" ");

        for(String num:numbers){
            sum+=Integer.parseInt(num);
            count++;
            if (count == 20) {
                file2.write((double)sum / count + " ");
                sum = 0;
                count = 0;
            }
        }
        scanner1.close();
        file2.close();
        scanner1.close();


        File file = new File("file2.txt");
        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String sc = scanner.nextLine();
        String[] numbStr = sc.split(" ");
        double sum = 0.0;

        for (String numbers : numbStr) {
            sum += Double.parseDouble(numbers);
        }
        System.out.print("Ответ: ");
        System.out.printf("%.0f", Math.floor(sum));
        scanner.close();

    }
}
