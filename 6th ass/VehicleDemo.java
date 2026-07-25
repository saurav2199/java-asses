class Vehicle {
    String vehicleName = "Toyota Fortuner";
    String vehicleType = "SUV";

    // Inner Class
    class Details {
        void display() {
            System.out.println("Vehicle Name : " + vehicleName);
            System.out.println("Vehicle Type : " + vehicleType);
        }
    }
}

// Interface
interface Action {
    void performAction();
}

public class VehicleDemo {
    public static void main(String[] args) {

        // Inner Class Object
        Vehicle vehicle = new Vehicle();
        Vehicle.Details details = vehicle.new Details();
        details.display();

        // Anonymous Class
        Action action = new Action() {
            public void performAction() {
                System.out.println("Vehicle is starting...");
            }
        };

        action.performAction();
    }
}