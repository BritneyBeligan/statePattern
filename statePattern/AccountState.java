package statePattern;
//interface
public interface AccountState {
    void activate();
    void suspend();
    void close();
    void withdraw(double amount);
    void deposit(double amount);

}
