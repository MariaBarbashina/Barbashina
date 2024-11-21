package fourth;

public class JsonHandler {
    public void loadJson(String fileName) {
        System.out.println("Чтение данных из JSON файла: " + fileName);
    }

    public void saveJson(String fileName, String data) {
        System.out.println("Сохранение данных в JSON файл: " + fileName);
        System.out.println("Содержимое: " + data);
    }
}
