package memento;

/**
 * Represents a Memento for the character state, storing the state of health, position, and artifacts.
 * The state of a character is immutable once the Memento is created.
 */
public class CharacterMemento {
    private final int health;
    private final String pos;
    private final String artifacts;

    /**
     * Constructs a new Memento for storing the character's state.
     *
     * @param health the health of the character.
     * @param pos the position of the character.
     * @param artifacts the artifacts possessed by the character.
     */
    public CharacterMemento(int health, String pos, String artifacts) {
        this.health = health;
        this.pos = pos;
        this.artifacts = artifacts;
    }

    /**
     * Gets the health of the character stored in this Memento.
     *
     * @return the health of the character.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets the position of the character stored in this Memento.
     *
     * @return the position of the character.
     */
    public String getPos() {
        return pos;
    }

    /**
     * Gets the artifacts of the character stored in this Memento.
     *
     * @return the artifacts of the character.
     */
    public String getArtifacts() {
        return artifacts;
    }
}
