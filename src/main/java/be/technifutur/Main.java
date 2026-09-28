package be.technifutur;

public class Main {
    static void main() {
        Fighter fighter = new Fighter(1, "Momo", 25, 1500);
        Fighter opponent = new Fighter(2, "Opponent", 20, 1000);

        boolean attack;

        do {
            attack = fighter.attack(opponent);
            System.out.println(attack ? "Attack successful!" : "Attack failed!");
            if (attack) {
                System.out.println(opponent.displayFighter());
            }
        } while (attack);

        if (opponent.isDefeated()) {
            System.out.println(opponent.getName() + " has been defeated!");
        }
    }

}
