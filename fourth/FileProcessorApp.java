package fourth;
import java.util.Scanner;

public class FileProcessorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileHandler fileHandler = null;

        System.out.println("Система обработки файлов. Поддерживаемые форматы: CSV, JSON, XML.");

        while (true) {
            System.out.print("\nВведите формат файла (csv, json, xml) или 'exit' для выхода: ");
            String format = scanner.nextLine().toLowerCase();

            if (format.equals("exit")) {
                System.out.println("Выход из приложения. Спасибо за использование!");
                break;
            }

            switch (format) {
                case "csv":
                    fileHandler = new CsvAdapter();
                    break;
                case "json":
                    fileHandler = new JsonAdapter();
                    break;
                case "xml":
                    fileHandler = new XmlAdapter();
                    break;
                default:
                    System.out.println("Неподдерживаемый формат: " + format);
                    continue;
            }

            System.out.print("Введите имя файла для чтения: ");
            String fileName = scanner.nextLine();
            fileHandler.read(fileName);

            System.out.print("Введите данные для записи: ");
            String data = scanner.nextLine();

            System.out.print("Введите имя файла для сохранения: ");
            String saveFileName = scanner.nextLine();
            fileHandler.write(saveFileName, data);
        }

        scanner.close();
    }
}
