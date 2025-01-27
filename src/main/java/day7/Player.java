package day7;

public class Player {
    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if(countPlayers < 6) {
            countPlayers++;
        }
    }
    public int getStamina() { return stamina; }

    public void run() {
        if (stamina == 0) {
            System.out.println("Игрок уходит с поля");
            return;
        }

        stamina--;

        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info(){
        if (countPlayers < 6) {
            System.out.printf("Команды неполные. На поле есть еще %d свободных места ", 6 - countPlayers);
        }
        else {
            System.out.println("Мест нет команды полны");
        }
    }

}
