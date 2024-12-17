package memento;

/**
 * Represents a character with mutable state, including health, position, and artifacts.
 * This class provides methods to modify the state, save the state as a Memento, and restore it from a Memento.
 */
public class Character {
    private int health;
    private String pos;
    private String artifacts;

    /**
     * Constructs a new Character with specified initial state.
     *
     * @param health the initial health of the character.
     * @param pos the initial position of the character.
     * @param artifacts the initial artifacts possessed by the character.
     */
    public Character(int health, String pos, String artifacts) {
        this.health = health;
        this.pos = pos;
        this.artifacts = artifacts;
    }

    /**
     * Gets the current health of the character.
     *
     * @return the health of the character.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets the current position of the character.
     *
     * @return the position of the character.
     */
    public String getPos() {
        return pos;
    }

    /**
     * Gets the current artifacts possessed by the character.
     *
     * @return the artifacts of the character.
     */
    public String getArtifacts() {
        return artifacts;
    }

    /**
     * Sets the health of the character.
     *
     * @param health the new health of the character.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Sets the position of the character.
     *
     * @param position the new position of the character.
     */
    public void setPos(String position) {
        this.pos = position;
    }

    /**
     * Sets the artifacts possessed by the character.
     *
     * @param artifacts the new artifacts possessed by the character.
     */
    public void setArtifacts(String artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * Saves the current state of the character as a Memento.
     *
     * @return the Memento containing the current state of the character.
     */
    public CharacterMemento save() {
        return new CharacterMemento(health, pos, artifacts);
    }

    /**
     * Restores the character's state from a given Memento.
     *
     * @param memento the Memento from which to restore the character's state.
     */
    public void restore(CharacterMemento memento) {
        this.health = memento.getHealth();
        this.pos = memento.getPos();
        this.artifacts = memento.getArtifacts();
    }

    /**
     * Displays the current state of the character.
     * This includes health, position, and artifacts.
     */
    public void displayState() {
        System.out.println("Character State:");
        System.out.println("Health: " + health);
        System.out.println("Position: " + pos);
        System.out.println("Artifacts: " + artifacts);
    }
}
