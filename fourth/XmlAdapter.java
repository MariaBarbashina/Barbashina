package fourth;

public class XmlAdapter implements FileHandler{
    private XmlHandler xmlHandler;

    public XmlAdapter() {
        this.xmlHandler = new XmlHandler();
    }

    @Override
    public void read(String fileName) {
        xmlHandler.loadXml(fileName);
    }

    @Override
    public void write(String fileName, String data) {
        xmlHandler.saveXml(fileName, data);
    }
}
