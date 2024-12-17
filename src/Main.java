import memento.*;
import memento.Character;

/**
 * Entry point for the application demonstrating the Memento pattern.
 * This class creates a character, modifies its state, saves the state, and then restores previous states.
 *
 * @author Pakuliak Oleksandr
 */
public class Main {
    /**
     * Main method to execute the application.
     * It demonstrates saving and restoring character states using Memento pattern.
     *
     * @param args the command-line arguments (not used).
     */
    public static void main(String[] args) {
        Character character = new Character(100, "start","None");
        History caretaker = new History();

        character.displayState();
        caretaker.save(character.save());

        character.setHealth(50);
        character.setPos("Forest");
        character.setArtifacts("Sword");
        System.out.println("\nAfter some changes:");
        character.displayState();

        caretaker.save(character.save());


        character.setHealth(10);
        character.setPos("Dungeon");
        character.setArtifacts("Shield");
        System.out.println("\nAfter more changes:");
        character.displayState();

        caretaker.save(character.save());


        character.restore(caretaker.restore());
        System.out.println("\nRestored previous state:");
        character.displayState();

        character.restore(caretaker.restore());
        System.out.println("\nRestored to initial state:");
        character.displayState();
    }
}