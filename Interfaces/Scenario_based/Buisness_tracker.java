interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {

    void generateReport();
}

interface Notifiable {

    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps, 3 km walked.");
    }

    @Override
    public void generateReport() {
        System.out.println("Report: Calories Burned = 250, Distance = 3 km.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Time to drink water!");
    }
}

public class Main {

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}