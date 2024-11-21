package seventh;

public class CarBuilderApp {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder("Tesla", "Model S")
                .setColor("Red")
                .setSunroof(true)
                .setGps(true)
                .setLeatherSeats(true)
                .build();

        Car car2 = new Car.CarBuilder("BMW", "X5")
                .setColor("Black")
                .setGps(true)
                .build();

        System.out.println("Автомобиль 1: " + car1);
        System.out.println("Автомобиль 2: " + car2);
    }
}
