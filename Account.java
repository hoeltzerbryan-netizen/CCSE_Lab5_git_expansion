public class Account {
    static private int accountNumber;
    private int nextNumber =10001;
    private double accountBalance;

    void Account(){
        accountNumber = nextNumber;
        nextNumber++;
        accountBalance = 0.0;
    }
    void Account(double i){
        accountNumber = nextNumber;
        nextNumber++;
        accountBalance = i;
    }
    double withdraw(double i){
        accountBalance = accountBalance - i;
        return accountBalance;
    }
    double deposit(double i){
        return i;
    }
    double getAccountBalance(){
        return ;
    }
    double getAccountNumber(){
        return ;
    }
    @Override
    public String toString(){
        return "Account "+accountNumber+", balance $"+accountBalance;
    }
}
