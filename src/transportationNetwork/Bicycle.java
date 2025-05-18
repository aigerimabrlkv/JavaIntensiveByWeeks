package transportationNetwork;

public class Bicycle extends TransportVehicle{
    public Bicycle( String name){
      super(name, 15);
    }
    @Override
    public void move(){

        System.out.println(name + " is pedaling....");


    }

}
