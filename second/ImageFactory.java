package second;

public interface ImageFactory {
    ImageLoader createLoader();
    ImageSaver createSaver();
}
