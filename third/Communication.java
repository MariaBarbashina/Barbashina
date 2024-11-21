package third;

public interface Communication {
    void connect(String deviceName);
    void sendCommand(String command);
    void disconnect(String deviceName);
}
