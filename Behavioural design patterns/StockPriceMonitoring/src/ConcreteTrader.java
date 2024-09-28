public class ConcreteTrader implements Observer {
    private String name;
    private double targetPrice;
    
    public ConcreteTrader(String name, double targetPrice) {
        this.name = name;
        this.targetPrice = targetPrice;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Trader " + name + " received alert: " + stockSymbol + " price is now " + price);
    }

    @Override
    public boolean shouldNotify(double price) {
        // Notify the trader only if the price exceeds the target
        return price >= targetPrice;
    }

    public String getName() {
        return name;
    }
}
