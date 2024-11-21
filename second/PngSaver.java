package second;

public class PngSaver implements ImageSaver{
    @Override
    public void save(String fileName) {
        System.out.println("Сохранение PNG изображения: " + fileName);
    }
}
