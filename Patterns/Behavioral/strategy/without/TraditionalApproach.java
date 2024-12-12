package Behavioral.strategy.without;

class GameCharacterOld {
    // No Strategy pattern, all fighting styles are handled within the class
    void fight(String style) {
        if (style.equals("sword")) {
            System.out.println("Fighting with a sword!");
        } else if (style.equals("magic")) {
            System.out.println("Casting a magic spell!");
        } else if (style.equals("run")) {
            System.out.println("Running away!");
        } else {
            System.out.println("No fighting style selected!");
        }
    }
}

public class TraditionalApproach {
    public static void main(String[] args) {
        GameCharacterOld character = new GameCharacterOld();

        // Character uses sword
        character.fight("sword");

        // Character uses magic
        character.fight("magic");

        // Character runs away
        character.fight("run");
    }
}
