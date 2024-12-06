package Factory_Design_Pattern;

public class Main {
    public static void main(String[] args) {
         VehicleFactory vehicleFactory=new VehicleFactory();
         Vehicle vehicle=vehicleFactory.getVehicle("Car");
         vehicle.drive();

         Vehicle vehicle1=vehicleFactory.getVehicle("BiKE");
         vehicle1.drive();

    }
}
