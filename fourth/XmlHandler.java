package fourth;

public class XmlHandler {
    public void loadXml(String fileName) {
        System.out.println("Чтение данных из XML файла: " + fileName);
    }

    public void saveXml(String fileName, String data) {
        System.out.println("Сохранение данных в XML файл: " + fileName);
        System.out.println("Содержимое: " + data);
    }
}
