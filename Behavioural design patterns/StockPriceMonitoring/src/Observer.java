public interface Observer {
    void update(String stockSymbol, double price);
    boolean shouldNotify(double price);
}
