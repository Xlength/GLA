package Mock_Exam.Java.MockJava;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // 创建一个Map
        Map<String, Integer> map = new HashMap<>();

        // 添加键值对
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("A", 4); // 如果键已存在，覆盖旧值

        // 打印Map
        System.out.println("Map内容: " + map);

        // 获取值
        int value = map.get("A");
        System.out.println("键A的值: " + value);

        // 检查是否包含键或值
        boolean containsKey = map.containsKey("B");
        boolean containsValue = map.containsValue(3);
        System.out.println("是否包含键B: " + containsKey);
        System.out.println("是否包含值3: " + containsValue);

        // 删除键值对
        map.remove("C");
        System.out.println("删除后的Map: " + map);

        // 遍历Map (方式1：使用entrySet)
        System.out.println("遍历Map (键值对):");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("键: " + entry.getKey() + ", 值: " + entry.getValue());
        }

        // 遍历Map (方式2：使用keySet)
        System.out.println("遍历Map (键):");
        for (String key : map.keySet()) {
            System.out.println("键: " + key + ", 值: " + map.get(key));
        }

        // 获取Map大小
        int size = map.size();
        System.out.println("Map大小: " + size);

        // 清空Map
        map.clear();
        System.out.println("清空后的Map: " + map);
    }
}
