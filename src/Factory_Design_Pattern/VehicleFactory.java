package Factory_Design_Pattern;

public class VehicleFactory {
    public Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        }
        else if(type.equalsIgnoreCase("Bike")){
            return new Bike();
        }

        return null;
    }
}
