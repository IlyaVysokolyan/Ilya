package day14;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList(new File("people.txt")));

    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            Scanner scanner1 = new Scanner(file);
            String name;
            String age;
            while (scanner.hasNextLine()) {
                while (scanner1.hasNextLine()) {
                    name = scanner.nextLine().replaceAll("[^\\Da-z]", "");
                    age = scanner1.nextLine().replaceAll("[^-0-9]", "");
                    if (Integer.parseInt(age) < 0) {
                        throw new NumberFormatException();
                    }
                    list.add(new Person(name, Integer.parseInt(age)));
                }
            }
            scanner.close();
            scanner1.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
        return list;
    }
}
