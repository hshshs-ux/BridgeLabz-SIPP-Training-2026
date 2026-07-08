import java.util.ArrayList;
import java.util.Scanner;

public class SmartParkingSlotManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> parking = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== SMART PARKING SLOT MANAGER =====");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Parked Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String entryVehicle = sc.nextLine();

                    if (parking.contains(entryVehicle)) {
                        System.out.println("Vehicle is already parked.");
                    } else {
                        parking.add(entryVehicle);
                        System.out.println("Vehicle entered successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String exitVehicle = sc.nextLine();

                    if (parking.remove(exitVehicle)) {
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Vehicle not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String searchVehicle = sc.nextLine();

                    if (parking.contains(searchVehicle)) {
                        System.out.println("Vehicle is currently parked.");
                    } else {
                        System.out.println("Vehicle is NOT parked.");
                    }
                    break;

                case 4:
                    System.out.println("\n----- Parked Vehicles -----");

                    if (parking.isEmpty()) {
                        System.out.println("No vehicles parked.");
                    } else {
                        for (String vehicle : parking) {
                            System.out.println(vehicle);
                        }
                    }

                    System.out.println("Total Occupied Parking Slots: " + parking.size());
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}