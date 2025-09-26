public class Account {
    //initializing 3 vars that will be used in the rest of the project like account#, bal#,
    //and var to hold next account number
    static private int accountNumber;
    private int nextNumber =10001;
    private double accountBalance;

    //default constructor
    void Account(){
        accountNumber = nextNumber;
        nextNumber++;
        accountBalance = 0.0;
    }

    //constructor for an account with  bal
    void Account(double i){
        accountNumber = nextNumber;
        nextNumber++;
        accountBalance = i;
    }

    //Just subtracting balance
    double withdraw(double i){
        accountBalance = accountBalance - i;
        return accountBalance;
    }

    //adding to bal
    double deposit(double i){
        accountBalance = accountBalance + i;
        return accountBalance;
    }

    //returns the balance
    double getAccountBalance(){
        return accountBalance;
    }

    //return account #
    double getAccountNumber(){
        return accountNumber;
    }
    @Override
    public String toString(){
        return "Account "+accountNumber+", balance $"+accountBalance;
    }
}
