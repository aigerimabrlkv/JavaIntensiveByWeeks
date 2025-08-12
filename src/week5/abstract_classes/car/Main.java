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
        ElectricCar myElectricCar = new ElectricCar("Tesla Model S", 100);

        System.out.println("--- Demonstrating Concrete Class Methods ---");
        myElectricCar.start();
        myElectricCar.drive();
        myElectricCar.refuel();
        myElectricCar.stop();
        System.out.println(myElectricCar.getVehicleState());
        System.out.println();


        GasolineCar myGasCar = new GasolineCar("Ford Mustang", 75);
        System.out.println("--- Demonstrating GasolineCar ---");
        myGasCar.start();
        myGasCar.drive();
        myGasCar.refuel();
        myGasCar.stop();
        System.out.println(myGasCar.getVehicleState());
        System.out.println();


        // We can also use polymorphism. The ElectricCar object can be
        // treated as a Vehicle because it implements the Vehicle interface.
        // This is a key benefit of interfaces - they define a common contract.
        System.out.println("--- Demonstrating Polymorphism with the Vehicle Interface ---");
        Vehicle aVehicle1 =  myElectricCar;
        Vehicle aVehicle2 =  myGasCar;
        aVehicle1.start();
        aVehicle2.start();
    }
}
