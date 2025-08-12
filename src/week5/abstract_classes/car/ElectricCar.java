package week5.abstract_classes.car;
// ======================= Concrete Class Definition ========================
/**
 * Task 3: Create a concrete class that extends the abstract class.
 * This class must provide concrete implementations for ALL abstract
 * methods from both the abstract class (Car) and the interface (Vehicle).
 */
class ElectricCar extends Car {
    // The constructor calls the superclass constructor.
    public ElectricCar(String model, int batteryCharge) {
        super(model, batteryCharge);
    }

    // Task 4: Implement the abstract method `start()` from the Vehicle interface.
    @Override
    public void start() {
        System.out.println(this.model + " is starting silently with a charge of " + this.batteryCharge + "%");
    }

    // Task 5: Implement the abstract method `stop()` from the Vehicle interface.
    @Override
    public void stop() {
        System.out.println(this.model + " is stopping and regenerative braking is active.");
    }

    // Task 6: Implement the abstract method `refuel()` from the abstract Car class.
    @Override
    public void refuel() {
        System.out.println(this.model + " is being charged at a station. Current charge: " + this.batteryCharge + "%");
        // We could add logic here to increase the charge.
    }
}