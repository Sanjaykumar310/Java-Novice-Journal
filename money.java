
import java.util.Scanner;

//ATM Simulator

public class money{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DEPOSITE YOUR MONEY :");
        int a = sc.nextInt();
        System.out.print("SELECT YOUR OPERATIONS DEPOSITE MONEY-1,WITHDRAW MONEY-3,CHECK BALANCE-2,EXIT :");
        int OPERATIONS = sc.nextInt();
        switch (OPERATIONS) {
            case 1:
                System.out.print("DEPOSITE MONEY :");
                int c = sc.nextInt();
                break;
            
            case 2: 
                System.out.print("CHECK BALANCE :"+(a));
                break;

            case 3:
                System.out.print("WITHDRAW MONEY :");
                int b = sc.nextInt();
                System.out.println("CURRENT BALANCE MONEY:"+(a-b));
                break;
            default:
               System.out.println("EXIT");
        }


        sc.close();
    }
}