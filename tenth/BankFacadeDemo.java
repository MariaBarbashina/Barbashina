package tenth;

public class BankFacadeDemo {
    public static void main(String[] args) {
        BankFacade myAccountFacade = new BankFacade("12345", 1000.0);

        BankAccount friendAccount = new BankAccount("67890", 500.0);

        myAccountFacade.checkBalance();
        myAccountFacade.deposit(200.0);
        myAccountFacade.checkBalance();
        myAccountFacade.withdraw(300.0);
        myAccountFacade.checkBalance();
        myAccountFacade.transfer(friendAccount, 400.0);
        myAccountFacade.checkBalance();

        System.out.println("Баланс: " + friendAccount.getBalance());
    }
}
