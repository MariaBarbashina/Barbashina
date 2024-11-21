package tenth;

public class BankFacade {
    private BankAccount account;
    private TransferService transferService;

    public BankFacade(String accountNumber, double initialBalance) {
        this.account = new BankAccount(accountNumber, initialBalance);
        this.transferService = new TransferService();
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void transfer(BankAccount toAccount, double amount) {
        transferService.transfer(account, toAccount, amount);
    }

    public void checkBalance() {
        System.out.println("Balance for account " + account.getAccountNumber() + ": " + account.getBalance());
    }
}
