package Behavioral.strategy.with;

// Strategy interface
interface FightStrategy {
    void fight();
}

// Concrete strategy: Sword fighting
class SwordFight implements FightStrategy {
    public void fight() {
        System.out.println("Fighting with a sword!");
    }
}

// Concrete strategy: Magic fighting
class MagicFight implements FightStrategy {
    public void fight() {
        System.out.println("Casting a magic spell!");
    }
}

// Concrete strategy: Running away
class RunAway implements FightStrategy {
    public void fight() {
        System.out.println("Running away!");
    }
}

// Context class (GameCharacter) that uses the strategies
class GameCharacter {
    private FightStrategy fightStrategy;

    // Setting the fight strategy through constructor or setter
    public GameCharacter(FightStrategy fightStrategy) {
        this.fightStrategy = fightStrategy;
    }

    public void setFightStrategy(FightStrategy fightStrategy) {
        this.fightStrategy = fightStrategy;
    }

    public void performFight() {
        fightStrategy.fight();
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        // Character fights with a sword
        GameCharacter character = new GameCharacter(new SwordFight());
        character.performFight();

        // Switch to magic fighting
        character.setFightStrategy(new MagicFight());
        character.performFight();

        // Switch to running away
        character.setFightStrategy(new RunAway());
        character.performFight();
    }
}
