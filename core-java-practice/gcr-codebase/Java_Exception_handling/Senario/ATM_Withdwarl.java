class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Main {

    public static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Available balance: ₹" +
                balance + ", Requested amount: ₹" + amount
            );
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {
        int balance = 5000;
        int amount = 8000;

        try {
            withdraw(balance, amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}