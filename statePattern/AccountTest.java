package statePattern;
//main
public class AccountTest {
    public static void main(String[] args){
        Account myAccount = new Account("1234", 10000.0);

        System.out.println("Welcome to Intell J Bank!\nPlease insert your Card:)");
        System.out.println();

        //Testing!
        myAccount.activate();
        myAccount.activate();
        myAccount.deposit(1000.0);
        myAccount.withdraw(10900.0);
        System.out.println();
        myAccount.suspend();
        myAccount.suspend();
        System.out.println();
        myAccount.close();
        myAccount.close();
        myAccount.activate();
        System.out.println("Please Get Your Card :)");




    }
}
