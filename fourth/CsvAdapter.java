package fourth;

public class CsvAdapter implements FileHandler{
    private CsvHandler csvHandler;

    public CsvAdapter() {
        this.csvHandler = new CsvHandler();
    }

    @Override
    public void read(String fileName) {
        csvHandler.loadCsv(fileName);
    }

    @Override
    public void write(String fileName, String data) {
        csvHandler.saveCsv(fileName, data);
    }
}
