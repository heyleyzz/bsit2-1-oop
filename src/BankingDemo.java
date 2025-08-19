public class BankingDemo {
    public static void main(String[] args) {
        System.out.println("Bank Name: " + BankAccount.getBankName());
        System.out.println("Interest Rate: " + (BankAccount.getInterestRate() * 100) + "%\n");

        BankAccount acc1 = new BankAccount("John Doe", 1000.0);
        BankAccount acc2 = new BankAccount("Jane Smith", 2500.0);
        BankAccount acc3 = new BankAccount("Bob Johnson", 500.0);

        System.out.println("\n[ Account Operations ]");
        acc1.deposit(500.0);
        acc2.withdraw(300.0);

        System.out.println("\n[ Interest Calculation ]");
        System.out.println(acc1.getAccountHolderName() + "'s interest: $" + acc1.calculateInterest());
        System.out.println(acc2.getAccountHolderName() + "'s interest: $" + acc2.calculateInterest());
        System.out.println(acc3.getAccountHolderName() + "'s interest: $" + acc3.calculateInterest());

        System.out.println("\nTotal Accounts Created: " + BankAccount.getTotalAccounts());
    }
}