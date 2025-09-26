import java.util.Scanner;
class Lab5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
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
        }while(option !=8);
        System.out.print("hi");
    }
}