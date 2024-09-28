public class PriceAlert {
    private String stockSymbol;
    private double alertPrice;

    public PriceAlert(String stockSymbol, double alertPrice) {
        this.stockSymbol = stockSymbol;
        this.alertPrice = alertPrice;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public double getAlertPrice() {
        return alertPrice;
    }
}
