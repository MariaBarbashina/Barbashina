package fifth;

public interface StockSubject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String stockName, double newPrice);
}
