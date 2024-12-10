package Mock_Exam.Java.MockJava;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // 创建一个Set
        Set<String> set = new HashSet<>();

        // 添加元素
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A"); // Set不允许重复元素，添加失败

        // 打印Set
        System.out.println("Set内容: " + set);

        // 检查是否包含元素
        boolean containsA = set.contains("A");
        System.out.println("是否包含A: " + containsA);

        // 删除元素
        set.remove("B");
        System.out.println("删除后的Set: " + set);

        // 遍历Set
        System.out.println("遍历Set:");
        for (String item : set) {
            System.out.println(item);
        }

        // 检查Set是否为空
        boolean isEmpty = set.isEmpty();
        System.out.println("Set是否为空: " + isEmpty);

        // 获取Set大小
        int size = set.size();
        System.out.println("Set大小: " + size);

        // 清空Set
        set.clear();
        System.out.println("清空后的Set: " + set);
    }
}

