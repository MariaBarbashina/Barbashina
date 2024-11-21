package second;

public class JpgLoader implements ImageLoader{
    @Override
    public void load(String fileName) {
        System.out.println("Загрузка JPG изображения: " + fileName);
    }
}
