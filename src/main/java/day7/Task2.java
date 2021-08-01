package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomStamina = (int) (Math.random() * ((101 - 90) + 1) + 90);
        Player player1 = new Player(randomStamina);
        Player player2 = new Player(randomStamina);
        Player player3 = new Player(randomStamina);
        Player player4 = new Player(randomStamina);
        Player player5 = new Player(randomStamina);
        Player player6 = new Player(randomStamina);
        for (int i = 0; i < 101; i++) {
            if (player1.getStamina() == 0) break;
            player1.run();
        }

        Player.info();

        Player player7 = new Player(randomStamina);
        Player player8 = new Player(randomStamina);

        System.out.println("Кол-во игроков на поле: " + Player.getCountPlayers());


    }
}
