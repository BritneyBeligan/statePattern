package statePattern;
//ACTIVESTATE CLASS
public class ActiveState implements  AccountState{
    private final Account account;

    public ActiveState(Account account){
        this.account = account;
    }

    @Override
    public void activate() {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend() {
        account.setAccountState(new SuspendedState(account));
        System.out.println("Account is suspended!");

    }

    @Override
    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");

    }

    @Override
    public void withdraw(double amount) {
       account.setBalance(account.getBalance() - amount);
       System.out.println("You Withdrawn $" + amount + " . Your Current Balance: $" + account.getBalance());

    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited $" + amount + ". Your Current Balance: $" + account.getBalance());
    }
}
