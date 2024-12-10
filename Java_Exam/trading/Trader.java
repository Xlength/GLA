package trading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trader {
    private List<Trade> trades;

    public Trader() {
        trades = new ArrayList<>();
        addRandomTrade(); // 初始化时添加一个随机 Trade
    }

    public List<Trade> getTrades() {
        return trades;
    }

    public void addRandomTrade() {
        Random rand = new Random();
        int gems = rand.nextInt(5) + 1; // 随机生成1到5之间的宝石数量
        int amount = rand.nextInt(5) + 1; // 随机生成1到5之间的商品数量
        Goods goods = Goods.values()[rand.nextInt(Goods.values().length)]; // 随机选择一种商品
        trades.add(new Trade(gems, amount, goods));
    }
}
