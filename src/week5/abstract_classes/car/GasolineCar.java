package week5.abstract_classes.car;

/**
 * Task 8: Create a new concrete class for a GasolineCar.
 * This class also extends `Car` and must implement all abstract methods.
 */
class GasolineCar extends Car {
    protected int fuelLevel;

    public GasolineCar(String model, int fuelLevel) {
        super(model);
        this.fuelLevel = fuelLevel;
    }

    // Task 9: Implement the `start()` method for a gasoline car.
    @Override
    public void start() {
        System.out.println(this.model + " is starting with a roar! Fuel level: " + this.fuelLevel + "%");
    }

    // Task 10: Implement the `stop()` method for a gasoline car.
    @Override
    public void stop() {
        System.out.println(this.model + " is stopping and the engine is off.");
    }

    // Task 11: Implement the `refuel()` method for a gasoline car.
    @Override
    public void refuel() {
        System.out.println(this.model + " is being refueled at a gas station. Current fuel level: " + this.fuelLevel + "%");
        // We could add logic here to increase the fuel level.
    }

    // Task 12: Implement the `getVehicleState()` method.
    @Override
    public String getVehicleState() {
        return "Fuel level: " + this.fuelLevel + "%";
    }
}
