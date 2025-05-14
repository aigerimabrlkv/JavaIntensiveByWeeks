package transportationNetwork;

public class Train extends TransportVehicle{
    public Train(String name){
        super( name, 100);
    }

    @Override
    public void move(){
        System.out.println(name +" is accelerating on tracks.");
    }
}
