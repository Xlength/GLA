package trading;

import java.util.HashMap;
import java.util.Map;

public class Citizen {
    private int gems;
    private Map<Goods, Integer> inventory;

    public Citizen(int gems, Map<Goods, Integer> inventory) {
        this.gems = gems;
        this.inventory = new HashMap<>();
        for (Goods goods : Goods.values()) {
            this.inventory.put(goods, 0);
        }
    }

    public int getGems() {
        return this.gems;
    }

    public int getAmount(Goods goods) {
        return inventory.get(goods);
    }

    public boolean executeTrade(Trade trade) {
        if (trade.getGems() > this.gems || trade.getAmount() > this.getAmount(trade.getGoods())) {
            return false;
        }
        this.gems -= trade.getGems();
        this.inventory.put(trade.getGoods(), this.getAmount(trade.getGoods()) - trade.getAmount());
        return true;
    }

    public static void main(String[] args) {
        Map<Goods, Integer> initialInventory = new HashMap<>();
        initialInventory.put(Goods.BREAD, 5);
        Citizen citizen = new Citizen(100, initialInventory);

        Trade trade = new Trade(10, 2, Goods.BREAD);
        System.out.println(citizen.executeTrade(trade));
        System.out.println("Remaining gems: " + citizen.getGems());
        System.out.println("Remaining BREAD: " + citizen.getAmount(Goods.BREAD));
    }
}
