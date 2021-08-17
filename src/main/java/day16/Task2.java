package day16;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter file1 = new PrintWriter("file1.txt");
        PrintWriter file2 = new PrintWriter("file2.txt");
        Random random = new Random();
        List<Integer> array = new ArrayList<>();
//       array.add(3);array.add(8);array.add(7);array.add(5);array.add(28);array.add(73);array.add(4);array.add(1);array.add(5);
//       array.add(32);array.add(89);array.add(12); // ДЛЯ ПРОВЕРКИ
        //ЗАПИСТЬ В ФАЙЛ1
        for (int i = 0; i < 1000; i++) {
            int rnd = random.nextInt(1000 + 1);
            array.add(rnd);
            file1.write(rnd + " ");
        }
        int counterNumbersFile2 = 0; //ПРОВЕРКА КОЛ-ВА ЧИСЕЛ В ФАЙЛЕ2
        //ЗАПИСЬ В ФАЙЛ2
        for (int i = 0; i < array.size() - 19; i += 20) {
            int sum = 0;
            for (int j = i; j < i + 20; j++) {
                sum += array.get(j);
            }
            file2.write((double) sum / 20 + " ");
            counterNumbersFile2++;
        }
        System.out.println(" КОЛ-ВО ЧИСЕЛ В ФАЙЛЕ2 ----->" + counterNumbersFile2);
        file1.close();
        file2.close();
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
