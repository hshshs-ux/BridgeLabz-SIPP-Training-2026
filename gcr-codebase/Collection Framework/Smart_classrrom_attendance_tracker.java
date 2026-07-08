import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SmartClassroomAttendanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> attendance = new HashMap<>();

        int choice;

        do {
            System.out.println("\n===== SMART CLASSROOM ATTENDANCE TRACKER =====");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Subject Name: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String student = sc.nextLine();

                    attendance.putIfAbsent(subject, new ArrayList<>());

                    if (attendance.get(subject).contains(student)) {
                        System.out.println("Attendance already marked.");
                    } else {
                        attendance.get(subject).add(student);
                        System.out.println("Attendance marked successfully.");
                    }
                    break;

                case 2:
                    if (attendance.isEmpty()) {
                        System.out.println("No attendance records found.");
                    } else {
                        for (String sub : attendance.keySet()) {
                            System.out.println("\nSubject: " + sub);
                            System.out.println("Students Present:");

                            for (String stu : attendance.get(sub)) {
                                System.out.println(stu);
                            }

                            System.out.println("Total Students: " + attendance.get(sub).size());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}