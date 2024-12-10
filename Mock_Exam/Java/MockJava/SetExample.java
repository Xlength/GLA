package Mock_Exam.Java.MockJava;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // 创建一个 HashSet
        Set<String> fruits = new HashSet<>();

        // 添加元素
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 尝试添加重复元素
        fruits.add("Apple");

        // 输出 Set
        System.out.println(fruits); // 输出: [Apple, Banana, Cherry]
    }
}
