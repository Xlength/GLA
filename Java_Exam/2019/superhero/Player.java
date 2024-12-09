package superhero;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents a player owning a set of game characters.
 */
public class Player {
    private final Set<GameCharacter> characters;

    /**
     * Constructor for Player.
     */
    public Player() {
        this.characters = new HashSet<>();
    }

    /**
     * Adds a character to the player's set of characters.
     * @param character the character to add
     */
    public void addCharacter(GameCharacter character) {
        characters.add(character);
    }

    /**
     * Retrieves the set of game characters owned by the player.
     * @return the set of characters
     */
    public Set<GameCharacter> getCharacters() {
        return characters;
    }
}
