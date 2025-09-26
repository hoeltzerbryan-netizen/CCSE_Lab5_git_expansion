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
            return withdraw(bal);
        }
    }
    //add money to account
    double deposit(double){

    }
    //inform of interest
    double addInterest(){

    }
    @Override
    public String toString(){
        return "Account #" + getAccountNumber()+", balance $"+ getAccountBalance();
    }
}
