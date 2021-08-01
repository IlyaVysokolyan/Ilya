package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(new MusicBand("Пикник", 1980));
        musicBandList.add(new MusicBand("ДДТ", 1980));
        musicBandList.add(new MusicBand("Король и Шут", 1990));
        musicBandList.add(new MusicBand("Звери", 2000));
        musicBandList.add(new MusicBand("Ночные снайперы", 2000));
        musicBandList.add(new MusicBand("Дыши", 2001));
        musicBandList.add(new MusicBand("Nons Stop", 2003));
        musicBandList.add(new MusicBand("Фактор 2", 2006));
        musicBandList.add(new MusicBand("Корни", 2005));
        musicBandList.add(new MusicBand("Винтаж", 2003));
        Collections.shuffle(musicBandList);

        for (MusicBand musicBand : musicBandList) {
            System.out.print(musicBand.getName() + " - " + musicBand.getYear() + " | ");
        }

        groupsAfter2000(musicBandList);
        System.out.println("\n");
        for (int i = 0; i < groupsAfter2000(musicBandList).size(); i++) {
            System.out.print(groupsAfter2000(musicBandList).get(i).getName() +
                    " - " + groupsAfter2000(musicBandList).get(i).getYear() + " | ");
        }

    }


    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000) {
                groupsAfter2000.add(bands.get(i));
            }
        }
        return groupsAfter2000;
    }
}
