package be.technifutur;

public class Main {
    static void main() {
        Fighter fighter = new Fighter(1, "Momo", 25, 1500);
        Fighter opponent = new Fighter(2, "Opponent", 20, 1000);

        System.out.println(fighter.displayFighter());
        System.out.println(opponent.displayFighter());

        fighter.attack(opponent);
        fighter.attack(opponent);

        opponent.attack(fighter);

        System.out.println("After the fight:");
        System.out.println(fighter.displayFighter());
        System.out.println(opponent.displayFighter());
    }
}
