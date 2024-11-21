package fifth;
import java.util.Scanner;

public class StockMarketApp {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать на фондовую биржу!");

        stockExchange.addStock("AAPL", 150.00);
        stockExchange.addStock("GOOGL", 2800.00);
        stockExchange.addStock("AMZN", 3500.00);

        Investor investor1 = new Investor("Алексей");
        Investor investor2 = new Investor("Ольга");
        Investor investor3 = new Investor("Иван");

        stockExchange.addObserver(investor1);
        stockExchange.addObserver(investor2);

        System.out.println("\nИнвесторы подписаны: Алексей и Ольга.");

        while (true) {
            System.out.println("\nДоступные команды:");
            System.out.println("1 - Изменить цену акции");
            System.out.println("2 - Подписать инвестора");
            System.out.println("3 - Отписать инвестора");
            System.out.println("4 - Выход");
            System.out.print("Введите команду: ");

            int command = scanner.nextInt();
            scanner.nextLine(); 

            switch (command) {
                case 1:
                    System.out.print("Введите название акции: ");
                    String stockName = scanner.nextLine();
                    System.out.print("Введите новую цену: ");
                    double newPrice = scanner.nextDouble();
                    stockExchange.updateStockPrice(stockName, newPrice);
                    break;

                case 2:
                    System.out.print("Введите имя инвестора для подписки (Алексей, Ольга, Иван): ");
                    String investorName = scanner.nextLine();
                    switch (investorName.toLowerCase()) {
                        case "алексей":
                            stockExchange.addObserver(investor1);
                            break;
                        case "ольга":
                            stockExchange.addObserver(investor2);
                            break;
                        case "иван":
                            stockExchange.addObserver(investor3);
                            break;
                        default:
                            System.out.println("Инвестор с таким именем не найден.");
                    }
                    break;

                case 3:
                    System.out.print("Введите имя инвестора для отписки (Алексей, Ольга, Иван): ");
                    String investorToRemove = scanner.nextLine();
                    switch (investorToRemove.toLowerCase()) {
                        case "алексей":
                            stockExchange.removeObserver(investor1);
                            break;
                        case "ольга":
                            stockExchange.removeObserver(investor2);
                            break;
                        case "иван":
                            stockExchange.removeObserver(investor3);
                            break;
                        default:
                            System.out.println("Инвестор с таким именем не найден.");
                    }
                    break;

                case 4:
                    System.out.println("Выход из приложения. Спасибо за использование!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверная команда.");
            }
        }
    }
}
