package third;

public class AutonomousCar extends RemoteDevice{
    public AutonomousCar(Communication communication) {
        super(communication);
    }
    @Override
    public void operate(String command) {
        System.out.println("Управление автономным автомобилем:");
        communication.connect("Автомобиль");
        communication.sendCommand(command);
        communication.disconnect("Автомобиль");
    }
}
