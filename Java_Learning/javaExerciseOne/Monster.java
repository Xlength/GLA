package javaExerciseone;
/*
 Design and implement a class Monster representing a (simplified) monster in a monster-battling 
game. A monster includes a type (a String), a number of hit points (an int), a number of attack 
points (an int), as well as list of weaknesses (i.e., types against which the monster is particularly 
weak in battle, represented as a String[]).
Define a Monster class with appropriate fields with correct access modifiers, as well as getter 
methods for all fields and an appropriate constructor.
You should also define the following two methods which are used when monsters battle each other:
 */

import java.util.Arrays;
public abstract class Monster {

    protected String type;
    protected int hitPoints;
    protected int attackPoints;
    protected String[] weaknesses;

    public Monster(String type, int hitPoints, int attackPoints,  String[] weaknesses) {

        this.type = type;
        this.hitPoints = hitPoints;
        this.attackPoints = attackPoints;
        this.weaknesses = weaknesses;

    }

// Getters and setters
    public int getHitPoints() {
        return hitPoints;
    }
    public int getAttackPoints() {
        return attackPoints;
    }
    public String getType() {
        return this.type;
    }

    public String[] getWeaknesses(){
        return this.weaknesses;
    }
    public boolean attack(Monster otherMonster) {
    // A monster cannot attack itself
        if (otherMonster == this) {
        return false;
    }
// A monster cannot attack or be attacked if it is knocked out
        if (this.hitPoints <= 0 || otherMonster.getHitPoints() <= 0) {
        return false;
    }

// Check if the other monster is weak against our type
    boolean otherIsWeak = otherMonster.isWeakAgainst(type);

    int pointsToRemove = (otherIsWeak) ? this.attackPoints + 20 
    : this.attackPoints;
    otherMonster.removeHitPoints(pointsToRemove);

    return true;
}

    private boolean isWeakAgainst(String otherType) {

    for (String weakness : this.weaknesses) {
        if (weakness.equals(otherType)) {
            return true;
        }
    }
        return false;
    }

    public void removeHitPoints(int points) {
        this.hitPoints -= points;
        if (hitPoints <= 0) {
        // Monster is knocked out
        hitPoints = 0;
        }
    }

    public String toString() {
    
        return "Monster type=" + type + 
        ", hitPoints=" + hitPoints + 
        ", attackPoints=" + attackPoints + 
        ", weaknesses=" + Arrays.toString(weaknesses) + "]";
    }


public static void main(String[] args) {
    // Monster fireMonster = new Monster("Fire", 200, 100, new String[] { "Water" });
    // Monster waterMonster = new Monster("Water", 130, 50, new String[] { "Fire", "Electric" });
    // System.out.println(fireMonster.toString());
    // System.out.println(waterMonster.toString());
    // System.out.println(waterMonster);

    // waterMonster.attack(fireMonster); // Should return true
    // System.out.println(fireMonster.getHitPoints()); // Should print fireMonster.getHitPoints();
}

}
