package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }

    }

    public void run() {

        stamina--;
//        System.out.println(getStamina()); // ВЫВОД ВЫНОСЛИВОСТИ
        if (stamina == 0) {
            countPlayers--;
            System.out.println("Игрок ушел с поля");
        }
    }

    public static void info() {
        int resultPlayers = 0;
        if (countPlayers < 6) {
            resultPlayers = 6 - countPlayers;
            if (resultPlayers == 1) {
                System.out.println("Команды неполные. На поле еще есть " + resultPlayers + " свободное место");
            } else if (resultPlayers == 2 || resultPlayers == 3 || resultPlayers == 4)
                System.out.println("Команды неполные. На поле еще есть " + resultPlayers + " свободных места");
            else System.out.println("Команды неполные. На поле еще есть " + resultPlayers + " свободных мест");
        } else System.out.println("На поле нет свободных мест");

    }
}
