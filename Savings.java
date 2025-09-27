public class Savings extends Account {
    private int numberOFDeposits = 0;

    Savings(double i){
        super(i);
    }
    //withdraw but under $500 10 dollar fee
    @Override
    double withdraw(double i){
        double bal = super.withdraw(i);
        if(bal<500){
            System.out.println("Charging a fee of $10 because you are below $500");
            return super.withdraw(500);
        }else{
            return getAccountBalance();
        }
    }
    //add money to account
    @Override
    double deposit(double i){
        numberOFDeposits++;
        System.out.print("This is deposit " + numberOFDeposits + " to this account");
        double bal = super.deposit(i);
        if(numberOFDeposits>5){
            System.out.println("Charging a fee of $10");
            super.withdraw(10);
        }
        return getAccountBalance();
    }
    //inform of interest
    double addInterest(){
        double x = .015 * getAccountBalance();
        System.out.println("Customer has earned $"+ x +" in interest");
        super.deposit(x);
        return getAccountBalance();
    }
    @Override
    public String toString(){
        return "Account #" + getAccountNumber()+", balance $"+ getAccountBalance();
    }
}
