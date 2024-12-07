package javaExerciseone;

public class WaterMonster extends Monster {
    public WaterMonster(int hitPoints, int attackPoints) {
    super("Water", hitPoints, attackPoints, new String[] { "Fire", 
    "Electric" } );
    }

    public boolean dodge() {
    return (hitPoints >= 100);
    }
    }