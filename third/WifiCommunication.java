package third;

public class WifiCommunication implements Communication{
    @Override
    public void connect(String deviceName) {
        System.out.println("Подключение к устройству " + deviceName + " через Wi-Fi.");
    }

    @Override
    public void sendCommand(String command) {
        System.out.println("Отправка команды через Wi-Fi: " + command);
    }

    @Override
    public void disconnect(String deviceName) {
        System.out.println("Отключение от устройства " + deviceName + " через Wi-Fi.");
    }
}
