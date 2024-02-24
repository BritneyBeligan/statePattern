package statePattern;
//CLOSEDSTATE CLASS
public class ClosedState implements AccountState{
    private final  Account account;

    public ClosedState(Account account){
        this.account = account;
    }

    //override methods!

    @Override
    public void activate() {
        System.out.println("Sadly, You cannot activate a closed account :(\nContact Support for Assistance :/");

    }

    @Override
    public void suspend() {
        System.out.println("Sadly, You cannot suspend a closed account :(");
    }

    @Override
    public void close() {
        System.out.println("Your Account is already Closed!!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("ERROR! You cannot withdraw from a closed Account!");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("ERROR! You cannot deposit from a closed Account!");
    }
}
