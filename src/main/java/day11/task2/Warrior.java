package day11.task2;

public class Warrior extends Hero {

    public Warrior() {
        health = 100;
        physDef = 0.8;
        physAtt = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
