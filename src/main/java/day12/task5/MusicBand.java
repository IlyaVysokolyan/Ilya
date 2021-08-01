package day12.task5;

import java.util.List;

class MusicBand {
    private String name; //название группы
    private List<MusicArtist> musicArtist;
    private int year;// год основания

    public MusicBand(String name, List<MusicArtist> musicArtist, int year) {
        this.name = name;
        this.musicArtist = musicArtist;
        this.year = year;
    }

    public List<MusicArtist> getMusicArtist() {
        return musicArtist;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }


    public static void transferMembers(MusicBand musicBand, MusicBand musicBand2) {
        for (int i = 0; i < musicBand.getMusicArtist().size(); i++) {
            musicBand2.getMusicArtist().add(musicBand.getMusicArtist().get(i));
        }
        musicBand.getMusicArtist().clear();
    }

    public void printMembers() {
        for (int i = 0; i < getMusicArtist().size(); i++) {
            System.out.println(getMusicArtist().get(i).getName() + " | ");
        }
    }
}
