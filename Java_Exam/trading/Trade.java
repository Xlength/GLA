package trading;

public class Trade {
    private int gems;
    private int amount;
    private Goods goods;
    
    public Trade(int gems, int amount, Goods goods) {
        this.gems = gems;
        this.amount = amount;
        this.goods = goods;
    }

    public int getGems() {
        return gems;
    }

    public int getAmount() {
        return amount;
    }

    public Goods getGoods() {
        return goods;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + gems;
        result = prime * result + amount;
        result = prime * result + ((goods == null) ? 0 : goods.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Trade other = (Trade) obj;
        if (gems != other.gems)
            return false;
        if (amount != other.amount)
            return false;
        if (goods != other.goods)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Trade [gems=" + gems + ", amount=" + amount + ", goods=" + goods + "]";
    }

    public void execute(Trader trader, Citizen citizen) {
        if (!trader.getTrades().contains(this)) {
            throw new IllegalArgumentException("Trade is not supported by the trader");
        }
        if (citizen.executeTrade(this)) {
            trader.addRandomTrade(); // 添加随机 Trade
        }
    }
    
}
