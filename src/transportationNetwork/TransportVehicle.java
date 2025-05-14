package transportationNetwork;

public abstract class TransportVehicle {
    String name;
    int speed;
    public TransportVehicle(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public void start(){
        System.out.println("The "+ name +" started.");
    }

    public abstract void move();

    public static void main(String[] args) {
        TransportVehicle[] vehicles = new TransportVehicle[2]; // Create an array to hold TransportVehicle objects

        vehicles[0] = new Bicycle("Bike"); // Create a Bicycle object and store it in the array
        vehicles[1] = new Train("Metra"); // Create a Train object and store it in the array

        for (TransportVehicle vehicle : vehicles) { // Iterate through the array
            vehicle.start(); // Call the start() method on each vehicle
            vehicle.move();  // Call the move() method on each vehicle
        }
    }
}
