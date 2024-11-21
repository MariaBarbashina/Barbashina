package ninth;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class EventLogger {
    private static EventLogger instance;
    private PrintWriter writer;

    private EventLogger() {
        try {
            writer = new PrintWriter(new FileWriter("event_log.txt", true));
        } catch (IOException e) {
            System.err.println("Ошибка при создании лог-файла: " + e.getMessage());
        }
    }

    public static EventLogger getInstance() {
        if (instance == null) {
            synchronized (EventLogger.class) { // Для потокобезопасности
                if (instance == null) {
                    instance = new EventLogger();
                }
            }
        }
        return instance;
    }

    public void logEvent(String event) {
        String timestamp = LocalDateTime.now().toString();
        writer.println("[" + timestamp + "] " + event);
        writer.flush();
    }

    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}
