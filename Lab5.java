import java.util.Scanner;
class Lab5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Checking C = new Checking(0);
        Savings S = new Savings(500);
        System.out.print("[Banking System]");
        do{
            System.out.print("1. Withdraw from Checking\n" +
                    "2. Withdraw from Savings\n" +
                    "3. Deposit to Checking\n" +
                    "4. Deposit to Savings\n" +
                    "5. Balance of Checking\n" +
                    "6. Balance of Savings\n" +
                    "7. Award Interest to Savings\n" +
                    "8. Quit\n" +
                    "Select option: ");
            option = sc.nextInt();

            switch(option){
                double numb;
                case 1:
                    System.out.println("How much would you like to withdraw from Checking? $");
                    numb = sc.nextDouble();
                    C.withdraw(numb);
                    if(C.getAccountBalance()<0){
                        System.out.print("Charging an overdraft fee of $20 because account is below $0");
                    }
                    System.out.print("Current balance of Checking is $"+C.getAccountBalance());
                    break;
                case 2:
                    System.out.print("How much would you like to withdraw from Savings? $");
                    numb = sc.nextDouble();
                    S.withdraw(numb);
                    if(S.getAccountBalance()<0){
                        System.out.print("Charging an overdraft fee of $10 because you are below $500");
                    }
                    System.out.print("Current balance of Checking is $"+S.getAccountBalance());
                    break;
                case 3:
                    System.out.print("How much would you like to deposit to Checking");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.print("Invalid option.");
            }
        }while(option !=8);
        System.out.print("hi");
    }
}