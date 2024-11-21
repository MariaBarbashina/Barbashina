package fifth;
import java.util.ArrayList;
import java.util.List;

public class StockExchange implements StockSubject{
    private List<Observer> observers;
    private List<String> stockNames;
    private List<Double> stockPrices;

    public StockExchange() {
        observers = new ArrayList<>();
        stockNames = new ArrayList<>();
        stockPrices = new ArrayList<>();
    }

    public void addStock(String stockName, double initialPrice) {
        stockNames.add(stockName);
        stockPrices.add(initialPrice);
        System.out.println("Добавлена акция: " + stockName + " с ценой " + initialPrice);
    }

    public void updateStockPrice(String stockName, double newPrice) {
        int index = stockNames.indexOf(stockName);
        if (index != -1) {
            stockPrices.set(index, newPrice);
            System.out.println("Цена акции " + stockName + " обновлена до " + newPrice);
            notifyObservers(stockName, newPrice);
        } else {
            System.out.println("Акция " + stockName + " не найдена.");
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockName, double newPrice) {
        for (Observer observer : observers) {
            observer.update(stockName, newPrice);
        }
    }
}
