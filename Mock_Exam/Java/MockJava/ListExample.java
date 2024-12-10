package Mock_Exam.Java.MockJava;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // 创建一个List
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A"); // List允许重复元素

        // 打印列表
        System.out.println("List内容: " + list);

        // 插入元素
        list.add(1, "D");
        System.out.println("插入后的List: " + list);

        // 获取元素
        String element = list.get(2);
        System.out.println("获取第3个元素: " + element);

        // 修改元素
        list.set(2, "E");
        System.out.println("修改后的List: " + list);

        // 删除元素
        list.remove(1); // 按索引删除
        list.remove("A"); // 按值删除，只删除第一个匹配项
        System.out.println("删除后的List: " + list);

        // 检查是否包含元素
        boolean containsB = list.contains("B");
        System.out.println("是否包含B: " + containsB);

        // 遍历列表
        System.out.println("遍历List:");
        for (String item : list) {
            System.out.println(item);
        }

        // 清空列表
        list.clear();
        System.out.println("清空后的List: " + list);
    }
}
