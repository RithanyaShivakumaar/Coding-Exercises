import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            LoggingConfig.setup();

            StockPriceMonitor monitor = new StockPriceMonitor();

            // Create stock entities
            Stock apple = new Stock("AAPL", 150.00);
            Stock google = new Stock("GOOG", 2800.00);
            Stock amazon = new Stock("AMZN", 3500.00);

            // Add stocks to the monitor
            monitor.addStock(apple);
            monitor.addStock(google);
            monitor.addStock(amazon);

            // Create traders with different price targets
            Observer trader1 = new ConcreteTrader("Trader 1", 3000.00);  // Interested in Google at 3000
            Observer trader2 = new ConcreteTrader("Trader 2", 160.00);   // Interested in Apple at 160

            // Subscribe traders
            monitor.subscribe(trader1);
            monitor.subscribe(trader2);

            // Simulate price changes
            monitor.updateStockPrice("GOOG", 2950.00);  // No alert
            monitor.updateStockPrice("AAPL", 162.00);   // Trader 2 gets notified
            monitor.updateStockPrice("GOOG", 3050.00);  // Trader 1 gets notified

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
