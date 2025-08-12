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

    // It can also have a constructor.
    public Car(String model) {
        this.model = model;
    }

    // A concrete method that provides a default implementation.
    // Any class extending Car will inherit this method.
    public void drive() {
        System.out.println(this.model + " is driving...");
    }

    // An abstract method that must be implemented by any concrete
    // class that extends this abstract class.
    public abstract void refuel();

    // A new abstract method to get the state of the vehicle (e.g., fuel level or battery charge).
    public abstract String getVehicleState();
}