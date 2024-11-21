package third;

public abstract class RemoteDevice {
    protected Communication communication;

    public RemoteDevice(Communication communication) {
        this.communication = communication;
    }

    public abstract void operate(String command);
}
