package third;

public class Drone extends RemoteDevice{
    public Drone(Communication communication) {
        super(communication);
    }
    @Override
    public void operate(String command) {
        System.out.println("Управление дроном:");
        communication.connect("Дрон");
        communication.sendCommand(command);
        communication.disconnect("Дрон");
    }
}
