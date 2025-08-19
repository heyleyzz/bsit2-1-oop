public class BankAccount {
    public static String bankName = "Liceo Bank";
    public static int totalAccounts = 0;
    public static double interestRate = 0.03;

    private static String generateAccountNumber() {
        totalAccounts++;
        return String.format("ACC%03d", totalAccounts);
    }

    public String accountNumber;
    public String accountHolderName;
    public double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        System.out.println("Account Created: " + accountNumber + " for "
                + accountHolderName + " with initial balance: $" + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolderName + " deposited $" + amount
                    + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount
                    + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public static String getBankName() {
        return bankName;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}