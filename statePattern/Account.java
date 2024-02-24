package statePattern;

public class Account {
    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this);
    }

    public void activate(){
        accountState.activate();
    }

    public void suspend(){
        accountState.suspend();
    }

    public void close(){
        accountState.close();
    }

    public void deposit(double amount){
        accountState.deposit(amount);
    }

    public void withdraw(double amount){
        accountState.withdraw(amount);
    }

    //setters and getters!

    public AccountState getAccountState() {

        return accountState;
    }

    public void setAccountState(AccountState accountState) {

        this.accountState = accountState;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountState=" + accountState +
                '}';
    }
}
