package second;

public class JpgSaver implements ImageSaver{
    @Override
    public void save(String fileName) {
        System.out.println("Сохранение JPG изображения: " + fileName);
    }
}
