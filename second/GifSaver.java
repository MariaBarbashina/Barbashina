package second;

public class GifSaver implements ImageSaver{
    @Override
    public void save(String fileName) {
        System.out.println("Сохранение GIF изображения: " + fileName);
    }
}
