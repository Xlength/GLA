package superhero;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Represents a game character with a name, cost, and a set of powers.
 */
public class GameCharacter {
    private final String name;
    private final int cost;
    private final Set<Power> powers;

    /**
     * Constructor for creating a GameCharacter.
     * @param name the name of the character
     * @param cost the cost of the character
     * @param powers the powers of the character
     */
    public GameCharacter(String name, int cost, Power... powers) {
        this.name = name;
        this.cost = cost;
        this.powers = new HashSet<>();
        Collections.addAll(this.powers, powers);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public Set<Power> getPowers() {
        return Collections.unmodifiableSet(powers);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof GameCharacter)) return false;
        GameCharacter other = (GameCharacter) obj;
        return name.equals(other.name) && powers.equals(other.powers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, powers);
    }

    @Override
    public String toString() {
        return "GameCharacter{name='" + name + "', cost=" + cost + ", powers=" + powers + "}";
    }

    public static Set<GameCharacter> chooseCharacters(Set<GameCharacter> availableCharacters, Power... neededPowers) {
        Set<Power> needed = new HashSet<>();
        Collections.addAll(needed, neededPowers);
        
        Set<GameCharacter> selected = new HashSet<>();
        for (GameCharacter character : availableCharacters) {
            Set<Power> intersection = new HashSet<>(character.getPowers());
            intersection.retainAll(needed);
            if (!intersection.isEmpty()) {
                selected.add(character);
                needed.removeAll(intersection);
            }
            if (needed.isEmpty()) {
                return selected;
            }
        }
        return null; // Not all powers covered
    }
}
