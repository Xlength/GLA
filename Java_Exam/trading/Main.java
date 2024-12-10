package trading;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 初始化 Goods 的数量
        Map<Goods, Integer> initialInventory = new HashMap<>();
        initialInventory.put(Goods.BREAD, 5);
        initialInventory.put(Goods.WOOL, 3);

        // 创建一个 Citizen（有 10 个 Gems 和一些 Goods）
        Citizen citizen = new Citizen(10, initialInventory);
        System.out.println("Initial Citizen Gems: " + citizen.getGems());
        System.out.println("Initial Citizen Inventory:");
        for (Goods goods : Goods.values()) {
            System.out.println(goods + ": " + citizen.getAmount(goods));
        }

        // 创建一个 Trader（初始带一个随机交易）
        Trader trader = new Trader();
        System.out.println("\nInitial Trader Trades:");
        for (Trade trade : trader.getTrades()) {
            System.out.println(trade);
        }

        // 获取 Trader 的第一个交易
        Trade firstTrade = trader.getTrades().get(0);
        System.out.println("\nAttempting to execute Trade: " + firstTrade);

        try {
            // 执行交易
            firstTrade.execute(trader, citizen);
            System.out.println("Trade executed successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Trade execution failed: " + e.getMessage());
        }

        // 输出交易后的 Citizen 和 Trader 状态
        System.out.println("\nUpdated Citizen Gems: " + citizen.getGems());
        System.out.println("Updated Citizen Inventory:");
        for (Goods goods : Goods.values()) {
            System.out.println(goods + ": " + citizen.getAmount(goods));
        }

        System.out.println("\nUpdated Trader Trades:");
        for (Trade trade : trader.getTrades()) {
            System.out.println(trade);
        }

        // 测试非法交易
        System.out.println("\nTesting invalid trade:");
        Trade invalidTrade = new Trade(100, 1, Goods.SWORD); // Citizen 无法负担的交易
        try {
            invalidTrade.execute(trader, citizen);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid trade failed as expected: " + e.getMessage());
        }
    }
}
