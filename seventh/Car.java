package seventh;

public class Car {
    private String brand;
    private String model;
    private String color;
    private boolean sunroof;
    private boolean gps;
    private boolean leatherSeats;
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
        this.gps = builder.gps;
        this.leatherSeats = builder.leatherSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", sunroof=" + sunroof +
                ", gps=" + gps +
                ", leatherSeats=" + leatherSeats +
                '}';
    }


    public static class CarBuilder {
        private String brand;
        private String model;
        private String color;
        private boolean sunroof;
        private boolean gps;
        private boolean leatherSeats;

        public CarBuilder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setGps(boolean gps) {
            this.gps = gps;
            return this;
        }

        public CarBuilder setLeatherSeats(boolean leatherSeats) {
            this.leatherSeats = leatherSeats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
