package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList(new File("people.txt")));

    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            String parts;
            for (String list1 : list) {
                parts = list1.replaceAll("[^-0-9]", ""); // регулярное выражение
                int i = Integer.parseInt(parts);
                if (i < 0) {
                    //list.clear(); Либо вернуть пустой список либо вернуть null
                    throw new NumberFormatException();
                }
            }
            scanner.close();


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
        return list;
    }
}
