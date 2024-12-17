package memento;

import java.util.Stack;

/**
 * Maintains a history of saved Mementos for a character.
 * Provides methods to save a new state and restore a previous state.
 */
public class History {
    private final Stack<CharacterMemento> history = new Stack<>();

    /**
     * Saves a Memento into the history.
     * After saving, it prints the entire history of Mementos.
     *
     * @param memento the Memento to be saved.
     */
    public void save(CharacterMemento memento) {
        history.push(memento);

        System.out.println("\nMementos in history:");
        for (CharacterMemento m : history) {
            System.out.println("Health: " + m.getHealth() + ", Position: " + m.getPos() + ", Artifacts: " + m.getArtifacts());
        }
        System.out.println();
    }

    /**
     * Restores the last saved state from the history.
     * If there is no state to restore, a default empty state is returned.
     *
     * @return the restored Memento.
     */
    public CharacterMemento restore() {
        if (history.isEmpty()) {
            return createEmptyHistory();
        } else if (history.size() == 1) {
            return history.peek();
        } else {
            history.pop();
            return history.peek();
        }
    }

    /**
     * Creates and returns a default empty Memento.
     *
     * @return an empty Memento with default values.
     */
    private CharacterMemento createEmptyHistory() {
        return new CharacterMemento(0, "None", "None");
    }
}
