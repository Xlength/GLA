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

    /**
     ... 是 可变参数（varargs） 的语法。它允许方法接受数量可变的参数，而不需要显式定义每个参数,可变参数必须是最后一个参数。
     */
    public Set<GameCharacter> chooseCharacters(Power... neededPowers) {
        Set<Power> remainingPowers = new HashSet<>(Set.of(neededPowers));//是将这个数组转化为一个不可变集合，用于进一步的逻辑处理。
        Set<GameCharacter> chosenCharacters = new HashSet<>();
/*
 *RemainingPowers：

    将 neededPowers 转化为一个 Set，用于快速判断哪些能力还没有被覆盖。
    Set 的特点是：元素唯一，支持高效的查找和删除操作。
    chosenCharacters：

    初始化一个空的 Set，用于存储被选中的角色。

 */
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
/*
 * 循环遍历 characters 集合：
每个 GameCharacter 都有可能拥有某些 Power，我们需要检查这些角色是否能提供所需的能力。

if (!remainingPowers.isEmpty())：

如果 remainingPowers 已经是空的（即所有需要的能力都被覆盖了），不需要继续循环。
获取角色的能力：
Set<Power> powers = character.getPowers();
character.getPowers() 返回当前角色拥有的能力集合。
判断能力是否匹配：

!Collections.disjoint(powers, remainingPowers)
这里使用 Collections.disjoint() 方法，检查两个集合是否没有交集。
如果返回 false，说明当前角色的能力和剩余需要的能力有交集。
添加角色并更新剩余能力：

chosenCharacters.add(character);
remainingPowers.removeAll(powers);
将当前角色加入到 chosenCharacters 集合中。
用 remainingPowers.removeAll(powers) 从剩余需求中移除当前角色已经覆盖的能力。

第三步：检查是否满足需求
return remainingPowers.isEmpty() ? chosenCharacters : null;
remainingPowers.isEmpty()：
如果所有需要的能力都被覆盖，remainingPowers 会是空的，返回 chosenCharacters。
如果还有未满足的能力：
如果 remainingPowers 还有未覆盖的能力，返回 null，表示无法满足需求。

 */
}
