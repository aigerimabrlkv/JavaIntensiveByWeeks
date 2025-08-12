package week5.abstract_classes.car;

/**
 * Main class to demonstrate the use of abstract classes and interfaces.
 * This class contains the main method to run the program.
 */
public class Main {
    public static void main(String[] args) {
        // We can create an instance of the concrete class, ElectricCar.
        // It provides implementations for all abstract methods from
        // the interface (Vehicle) and the abstract class (Car).
        ElectricCar myCar = new ElectricCar("Tesla Model S", 100);

        System.out.println("--- Demonstrating Concrete Class Methods ---");
        myCar.start();
        myCar.drive();
        myCar.refuel();
        myCar.stop();
        System.out.println();

        // We can also use polymorphism. The ElectricCar object can be
        // treated as a Vehicle because it implements the Vehicle interface.
        // This is a key benefit of interfaces - they define a common contract.
        System.out.println("--- Demonstrating Polymorphism with the Vehicle Interface ---");
        Vehicle anotherCar = new ElectricCar("Nissan Leaf", 85);
        anotherCar.start();
        anotherCar.stop();
    }
}
