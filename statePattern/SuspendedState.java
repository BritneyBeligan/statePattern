package statePattern;
//SUSPENDEDSTATE CLASS
public class SuspendedState implements AccountState{
    private final Account account;

    public SuspendedState(Account account){
        this.account = account;
    }

    //override methods!


    @Override
    public void activate() {
        account.setAccountState(new ActiveState((account)));
        System.out.println("Account is activated!");
    }

    @Override
    public void suspend() {
        System.out.println("You reached your limit... \nAccount is already suspended!");
    }

    @Override
    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");

    }

    @Override
    public void withdraw(double amount) {
        System.out.println("You cannot withdraw on a suspended account!");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("You cannot deposit on a suspended account!");
    }
}
