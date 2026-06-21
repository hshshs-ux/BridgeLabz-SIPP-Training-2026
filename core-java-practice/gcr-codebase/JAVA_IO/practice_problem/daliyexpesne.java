import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expense category: ");
        String category = sc.nextLine();

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        try (FileWriter fw = new FileWriter("expenses.txt", true)) {
            fw.write(category + " - " + amount + System.lineSeparator());
            System.out.println("Expense saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving expense.");
        }

        sc.close();
    }
}