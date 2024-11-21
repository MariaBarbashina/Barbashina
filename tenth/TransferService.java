package tenth;

public class TransferService {
    public void transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        if (fromAccount.getBalance() >= amount && amount > 0) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from " + fromAccount.getAccountNumber() +
                    " to " + toAccount.getAccountNumber());
        } else {
            System.out.println("Transfer failed due to insufficient funds or invalid amount.");
        }
    }
}
