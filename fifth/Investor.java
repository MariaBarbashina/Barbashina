package fifth;

public class Investor implements Observer{
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("Инвестор " + name + " уведомлен: Цена акции " + stockName + " изменилась до " + newPrice);
    }
}
