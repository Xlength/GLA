package Mock_Exam.Java.MockJava;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // 创建一个 HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 添加键值对
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // 输出 HashMap 的内容
        System.out.println(map); // 输出: {1=Apple, 2=Banana, 3=Cherry}

        // 根据键获取值
        System.out.println("Key 2 maps to: " + map.get(2)); // 输出: Key 2 maps to: Banana

        // 遍历键值对
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
