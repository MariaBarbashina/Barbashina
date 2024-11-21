package second;

public class PngFactory implements ImageFactory{
    @Override
    public ImageLoader createLoader() {
        return new PngLoader();
    }

    @Override
    public ImageSaver createSaver() {
        return new PngSaver();
    }
}
