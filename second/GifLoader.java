package second;

public class GifLoader implements ImageLoader{
    @Override
    public void load(String fileName) {
        System.out.println("Загрузка GIF изображения: " + fileName);
    }
}
