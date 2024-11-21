package third;

public class BluetoothCommunication implements Communication{
    @Override
    public void connect(String deviceName) {
        System.out.println("Подключение к устройству " + deviceName + " через Bluetooth.");
    }

    @Override
    public void sendCommand(String command) {
        System.out.println("Отправка команды через Bluetooth: " + command);
    }

    @Override
    public void disconnect(String deviceName) {
        System.out.println("Отключение от устройства " + deviceName + " через Bluetooth.");
    }
}
