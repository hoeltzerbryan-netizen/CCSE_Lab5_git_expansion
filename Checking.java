public class Checking extends Account {
    Checking(double i){
        super(i);
    }

    @Override
    double withdraw(double i){
        accountBalance = accountBalance - i;
        if(getAccountBalance()<0){
            accountBalance = accountBalance - 20;
            return "“Charging an overdraft fee of $20 because " +
                    "account is below $0";
        }else{
            return accountBalance;
        }

    }
    @Override
    public String toString(){
        return "Account #" + getAccountNumber()+", balance $"+ getAccountBalance;
    }
}
