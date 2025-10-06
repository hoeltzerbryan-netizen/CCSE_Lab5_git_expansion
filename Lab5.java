import java.util.Scanner;
class Lab5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Checking C = new Checking(0);
        Savings S = new Savings(500);
        System.out.println("[Banking System]");
        System.out.print("Create a user name: ");
        String User = sc.nextLine();
        System.out.print("Create a password: ");
        String pass = sc.nextLine();
        Password P = new Password(User,pass);
        do{
            sc.nextLine();
            System.out.print("Before you start enter your password to reconfirm. ");
            String Pass = sc.nextLine();
            if(P.isPass(Pass)!=true) {
                System.out.print("Incorrect");
                break;
            }
            System.out.print("\nUser: "+P.getAccountUser()+"\n1. Withdraw from Checking\n" +
                    "2. Withdraw from Savings\n" +
                    "3. Deposit to Checking\n" +
                    "4. Deposit to Savings\n" +
                    "5. Balance of Checking\n" +
                    "6. Balance of Savings\n" +
                    "7. Award Interest to Savings\n" +
                    "8. Quit\n" +
                    "Select option: ");
            option = sc.nextInt();
            double numb;
            switch(option){
                case 1:
                    System.out.print("\nHow much would you like to withdraw from Checking? $");
                    numb = sc.nextDouble();
                    C.withdraw(numb);
                    System.out.println("Current balance of Checking is $"+C.getAccountBalance());
                    break;
                case 2:
                    System.out.print("\nHow much would you like to withdraw from Savings? $");
                    numb = sc.nextDouble();
                    S.withdraw(numb);
                    System.out.println("Current balance of Savings is $"+S.getAccountBalance());
                    break;
                case 3:
                    System.out.print("\nHow much would you like to deposit to Checking? $");
                    numb = sc.nextDouble();
                    C.deposit(numb);
                    System.out.println("Current balance of Checking is $"+C.getAccountBalance());
                    break;
                case 4:
                    System.out.print("\nHow much would you like to deposit to Savings? $");
                    numb = sc.nextDouble();
                    S.deposit(numb);
                    System.out.println("Current balance of Savings is $"+S.getAccountBalance());
                    break;
                case 5:
                    System.out.println("\nChecking Account #"+C.getAccountNumber()+", balance: $"+C.getAccountBalance());
                    break;
                case 6:
                    System.out.println("\nSavings Account #"+S.getAccountNumber()+", balance: $"+S.getAccountBalance());
                    break;
                case 7:
                    S.addInterest();
                    System.out.println("Current balance of Savings is $"+S.getAccountBalance());
                    break;
                case 8:
                    System.out.println("\nShutting Off...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }while(option !=8);
    }
}