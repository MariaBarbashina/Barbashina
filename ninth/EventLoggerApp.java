package ninth;

public class EventLoggerApp {
    public static void main(String[] args) {
        EventLogger logger = EventLogger.getInstance();

        logger.logEvent("Приложение запущено.");
        logger.logEvent("Выполняется действие: загрузка данных.");
        logger.logEvent("Ошибка: не удалось подключиться к базе данных.");
        logger.logEvent("Приложение завершило работу.");

        logger.close();

        System.out.println("Все события записаны в event_log.txt");
    }
}
