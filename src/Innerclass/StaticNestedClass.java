package Innerclass;
class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Static Nested Class
    public static class Engine {
        private int cylinders;
        private String fuelType;

        public Engine(int cylinders, String fuelType) {
            this.cylinders = cylinders;
            this.fuelType = fuelType;
        }

        public void start() {
            System.out.println("Engine started. " + cylinders + "-cylinder " + fuelType + " engine.");
        }

        public void stop() {
            System.out.println("Engine stopped.");
        }
    }


}


public class StaticNestedClass {
    public static void main(String[] args) {
        //  engine object
        Car.Engine engine = new Car.Engine(8, "Petrol");

        // method calling
        engine.start();
        engine.stop();
    }
}
