package second;

public class JpgFactory implements ImageFactory{
    @Override
    public ImageLoader createLoader() {
        return new JpgLoader();
    }

    @Override
    public ImageSaver createSaver() {
        return new JpgSaver();
    }
}
