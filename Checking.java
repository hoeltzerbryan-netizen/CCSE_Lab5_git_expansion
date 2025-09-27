public class Checking extends Account {
    //constructor
    Checking(double i){
        super(i);
    }

    //withdraw override to now if you have less than 20 dollars after withdraw then extra 20 dollar fee
    @Override
    double withdraw(double i){
        double bal = super.withdraw(i);
        if(bal<0){
            System.out.println("Charging an overdraft fee of $20 because " +
                    "account is below $0 ");
            return super.withdraw(20);
        }else{
            return getAccountBalance();
        }
    }
    //another toString
    @Override
    public String toString(){
        return "Account #" + getAccountNumber()+", balance $"+ getAccountBalance();
    }
}
