package superhero;

import java.util.Collections;
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

    public Set<GameCharacter> chooseCharacters(Power... neededPowers) {
        Set<Power> remainingPowers = new HashSet<>(Set.of(neededPowers));
        Set<GameCharacter> chosenCharacters = new HashSet<>();

        for (GameCharacter character : characters) {
            if (!remainingPowers.isEmpty()) {
                Set<Power> powers = character.getPowers();
                if (!powers.isEmpty() && !Collections.disjoint(powers, remainingPowers)) {
                    chosenCharacters.add(character);
                    remainingPowers.removeAll(powers);
                }
            }
        }
        return remainingPowers.isEmpty() ? chosenCharacters : null;
    }
}
