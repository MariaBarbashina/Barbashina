package second;

public class GifFactory implements ImageFactory{
    @Override
    public ImageLoader createLoader() {
        return new GifLoader();
    }

    @Override
    public ImageSaver createSaver() {
        return new GifSaver();
    }
}
