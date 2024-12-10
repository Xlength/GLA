package superhero;

import java.util.Set;

public class TestGame {
    public static void main(String[] args) {
        // 创建几个游戏角色
        GameCharacter robin = new GameCharacter("Robin", 100, Power.WEAPONS);
        GameCharacter starfire = new GameCharacter("Starfire", 200, Power.FLIGHT, Power.ENERGY_BLAST);
        GameCharacter cyborg = new GameCharacter("Cyborg", 150, Power.STRENGTH, Power.WEAPONS);
        GameCharacter beastBoy = new GameCharacter("Beast Boy", 120, Power.TRANSFORMATION);
        GameCharacter raven = new GameCharacter("Raven", 180, Power.MAGIC);

        // 创建玩家并添加角色
        Player player = new Player();
        player.addCharacter(robin);
        player.addCharacter(starfire);
        player.addCharacter(cyborg);
        player.addCharacter(beastBoy);
        player.addCharacter(raven);

        // 测试选择角色的方法
        System.out.println("Player's characters: " + player.getCharacters());
        
        System.out.println("\nTest case 1: Required powers: WEAPONS, STRENGTH");
        Set<GameCharacter> chosenCharacters1 = player.chooseCharacters(Power.WEAPONS, Power.STRENGTH);
        System.out.println("Chosen characters: " + chosenCharacters1);

        System.out.println("\nTest case 2: Required powers: FLIGHT, STRENGTH, TRANSFORMATION");
        Set<GameCharacter> chosenCharacters2 = player.chooseCharacters(Power.FLIGHT, Power.STRENGTH, Power.TRANSFORMATION);
        System.out.println("Chosen characters: " + chosenCharacters2);

        System.out.println("\nTest case 3: Required powers: TRANSFORMATION, MAGIC, SCIENCE");
        Set<GameCharacter> chosenCharacters3 = player.chooseCharacters(Power.TRANSFORMATION, Power.MAGIC, Power.SCIENCE);
        System.out.println("Chosen characters: " + chosenCharacters3);
    }
}
