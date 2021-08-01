package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> groupMember1 = new ArrayList<>();
        groupMember1.add("Иван Иванов");
        groupMember1.add("Петр Петров");
        groupMember1.add("Алексей Сидоров");
        groupMember1.add("Сергей Козлов");
        groupMember1.add("Николай Никитин");

        MusicBand musicBand1 = new MusicBand("Фактор 1", groupMember1, 2000);

        List<String> groupMember2 = new ArrayList<>();
        groupMember2.add("Рома Зверь");
        groupMember2.add("Кирилл Антоненко");
        groupMember2.add("Максим Леонов");
        groupMember2.add("Вячеслав Зарубов");

        MusicBand musicBand2 = new MusicBand("Звери", groupMember2, 2004);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();


    }
}
