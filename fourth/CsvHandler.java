package fourth;

public class CsvHandler {
    public void loadCsv(String fileName) {
        System.out.println("Чтение данных из CSV файла: " + fileName);
    }

    public void saveCsv(String fileName, String data) {
        System.out.println("Сохранение данных в CSV файл: " + fileName);
        System.out.println("Содержимое: " + data);
    }
}
