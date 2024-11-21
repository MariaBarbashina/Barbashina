package third;

public class Robot extends RemoteDevice{
    public Robot(Communication communication) {
        super(communication);
    }
    @Override
    public void operate(String command) {
        System.out.println("Управление роботом:");
        communication.connect("Робот");
        communication.sendCommand(command);
        communication.disconnect("Робот");
    }
}
