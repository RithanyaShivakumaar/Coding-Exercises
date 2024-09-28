import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class StockPriceMonitor {
    private static final Logger logger = Logger.getLogger(StockPriceMonitor.class.getName());
    private List<Observer> traders;
    private List<Stock> stocks;
    private Lock lock = new ReentrantLock();

    public StockPriceMonitor() {
        this.traders = new ArrayList<>();
        this.stocks = new ArrayList<>();
    }

    public void subscribe(Observer trader) {
        lock.lock();
        try {
            this.traders.add(trader);
            logger.info("Trader subscribed: " + trader.getClass().getName());
        } finally {
            lock.unlock();
        }
    }

    public void unsubscribe(Observer trader) {
        lock.lock();
        try {
            this.traders.remove(trader);
            logger.info("Trader unsubscribed: " + trader.getClass().getName());
        } finally {
            lock.unlock();
        }
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void updateStockPrice(String symbol, double newPrice) {
        lock.lock();
        try {
            for (Stock stock : stocks) {
                if (stock.getSymbol().equals(symbol)) {
                    stock.setPrice(newPrice);
                    notifyTraders(stock);
                    break;
                }
            }
        } finally {
            lock.unlock();
        }
    }

    private void notifyTraders(Stock stock) {
        logger.info("Notifying traders about " + stock.getSymbol() + " price change...");
        for (Observer trader : traders) {
            if (trader.shouldNotify(stock.getPrice())) {
                trader.update(stock.getSymbol(), stock.getPrice());
            }
        }
    }
}
