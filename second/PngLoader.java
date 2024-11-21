package second;

public class PngLoader implements ImageLoader{
    @Override
    public void load(String fileName) {
        System.out.println("Загрузка PNG изображения: " + fileName);
    }
}
