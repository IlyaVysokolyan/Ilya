package day12.task4;

import java.util.ArrayList;
import java.util.List;

class MusicBand {
    private String name; //название группы
    private List<String> groupMember;
    private int year;// год основания

    public MusicBand(String name, List<String> groupMember, int year) {
        this.name = name;
        this.groupMember = groupMember;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setGroupMember(List<String> groupMember) {
        this.groupMember = groupMember;
    }

    public List<String> getGroupMember() {
        return groupMember;
    }

    public static void transferMembers(MusicBand musicBand, MusicBand musicBand2) {
        for (String m : musicBand.getGroupMember()) {
            musicBand2.getGroupMember().add(m);
        }
        musicBand.getGroupMember().clear();

    }

    public void printMembers() {
        System.out.println(getGroupMember());
    }
}
