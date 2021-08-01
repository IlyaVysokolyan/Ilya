package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtistsList = new ArrayList<>();

        musicArtistsList.add(new MusicArtist("Иван Иванов", 24));
        musicArtistsList.add(new MusicArtist("Петр Петров", 25));
        musicArtistsList.add(new MusicArtist("Алексей Сидоров", 30));
        musicArtistsList.add(new MusicArtist("Сергей Козлов", 45));
        musicArtistsList.add(new MusicArtist("Николай Никитин", 27));

        MusicBand musicBand = new MusicBand("Фактор 1", musicArtistsList, 2000);

        List<MusicArtist> musicArtistList2 = new ArrayList<>();

        musicArtistList2.add(new MusicArtist("Рома Зверь", 35));
        musicArtistList2.add(new MusicArtist("Кирилл Антоненко", 33));
        musicArtistList2.add(new MusicArtist("Максим Леонов", 24));
        musicArtistList2.add(new MusicArtist("Вячеслав Зарубов", 47));

        MusicBand musicBand1 = new MusicBand("Звери", musicArtistList2, 2004);

        System.out.println("Группа 1 без изенения: ");
        musicBand.printMembers();
        System.out.println("Группа 2 без изменеия: ");
        musicBand1.printMembers();


        MusicBand.transferMembers(musicBand, musicBand1);

        System.out.println("Новая группа 1: ");
        musicBand.printMembers();
        System.out.println("Новая группа 2: ");
        musicBand1.printMembers();


    }
}
