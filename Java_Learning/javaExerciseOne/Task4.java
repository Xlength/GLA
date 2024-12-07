package javaExerciseone;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();
        // 添加键值对
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // 获取值
        System.out.println("Alice's age: " + map.get("Alice")); // 输出：30

        // 删除键值对
        map.remove("Bob");

        // 遍历 Map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 检查存在性
        System.out.println("Contains Alice? " + map.containsKey("Alice")); // 输出：true
        System.out.println("Contains age 25? " + map.containsValue(25));   // 输出：false
    }
}
