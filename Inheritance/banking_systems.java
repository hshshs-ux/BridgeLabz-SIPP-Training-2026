abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Deposited Successfully");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Withdrawn Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {

    private double monthlyBonusRate;

    public CurrentAccount(String accountNumber, String holderName, double balance, double monthlyBonusRate) {
        super(accountNumber, holderName, balance);
        this.monthlyBonusRate = monthlyBonusRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

public class Main {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA101", "Harshit", 50000, 5);

        sa.deposit(5000);
        sa.withdraw(3000);
        sa.displayAccountDetails();
        System.out.println("Interest : " + sa.calculateInterest());

        System.out.println();

        CurrentAccount ca = new CurrentAccount("CA201", "Rahul", 40000, 2);

        ca.deposit(10000);
        ca.withdraw(5000);
        ca.displayAccountDetails();
        System.out.println("Interest : " + ca.calculateInterest());
    }
}