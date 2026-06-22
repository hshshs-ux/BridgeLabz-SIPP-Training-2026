class Vehicle {
    static double registrationFee = 5000;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Harshit", "Car", "DL01AB1234");

        Vehicle.updateRegistrationFee(7000);

        if (v1 instanceof Vehicle) {
            v1.displayDetails();
        }
    }
}