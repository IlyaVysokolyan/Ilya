package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("VOLVO");
        list.add("AUDI");
        list.add("Mers");
        list.add("Opel");
        System.out.println(list);

        list.add((list.size()/2),"UAZ");
        list.remove(0);
        System.out.println(list);

    }
}
