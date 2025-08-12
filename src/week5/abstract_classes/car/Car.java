package week5.abstract_classes.car;
// ======================= Abstract Class Definition ========================
/**
 * Task 2: Create an abstract class that implements the interface.
 * An abstract class can have both abstract methods (like an interface)
 * and concrete, implemented methods. It cannot be instantiated directly.
 * It serves as a base class for other, more specific classes.
 */
abstract class Car implements Vehicle {
    // An abstract class can have member variables.
    protected String model;
    protected int batteryCharge;

    // It can also have a constructor.
    public Car(String model, int batteryCharge) {
        this.model = model;
        this.batteryCharge = batteryCharge;
    }

    // A concrete method that provides a default implementation.
    // Any class extending Car will inherit this method.
    public void drive() {
        System.out.println(this.model + " is driving...");
    }

    // A method to get the current battery charge.
    public int getBatteryCharge() {
        return this.batteryCharge;
    }

    // An abstract method that must be implemented by any concrete
    // class that extends this abstract class.
    public abstract void refuel();
}