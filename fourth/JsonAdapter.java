package fourth;

public class JsonAdapter implements FileHandler {
    private JsonHandler jsonHandler;

    public JsonAdapter() {
        this.jsonHandler = new JsonHandler();
    }

    @Override
    public void read(String fileName) {
        jsonHandler.loadJson(fileName);
    }

    @Override
    public void write(String fileName, String data) {
        jsonHandler.saveJson(fileName, data);
    }
}
