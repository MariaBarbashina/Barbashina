package third;
import java.util.Scanner;

public class RemoteControlApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в приложение для управления устройствами!");
        System.out.println("Доступные устройства: robot, drone, car");
        System.out.println("Доступные способы связи: wifi, bluetooth");

        while (true) {
            System.out.print("\nВведите тип устройства (robot, drone, car) или 'exit' для выхода: ");
            String deviceType = scanner.nextLine().toLowerCase();

            if (deviceType.equals("exit")) {
                System.out.println("Выход из приложения. Спасибо за использование!");
                break;
            }

            System.out.print("Выберите способ связи (wifi, bluetooth): ");
            String communicationType = scanner.nextLine().toLowerCase();

            Communication communication;
            switch (communicationType) {
                case "wifi":
                    communication = new WifiCommunication();
                    break;
                case "bluetooth":
                    communication = new BluetoothCommunication();
                    break;
                default:
                    System.out.println("Неподдерживаемый способ связи: " + communicationType);
                    continue;
            }

            RemoteDevice device;
            switch (deviceType) {
                case "robot":
                    device = new Robot(communication);
                    break;
                case "drone":
                    device = new Drone(communication);
                    break;
                case "car":
                    device = new AutonomousCar(communication);
                    break;
                default:
                    System.out.println("Неподдерживаемое устройство: " + deviceType);
                    continue;
            }

            System.out.print("Введите команду для устройства: ");
            String command = scanner.nextLine();

            device.operate(command);
        }

        scanner.close();
    }
}
