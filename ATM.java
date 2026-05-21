
import java.util.Scanner;

public class ATM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your first number :");
        int a = sc.nextInt();

        System.out.print("enter your second number :");
        int b = sc.nextInt();

        System.out.print("select operations (+,-,*,%,/):");
        char operations = sc.next().charAt(0);

        switch (operations) {
            case '+':
                
                System.out.println("Result :" + (a+b));
                break;

            case '-':
                System.out.println("Result :" + (a-b));
                break;

            case '*':
                System.out.println("Result :" + (a*b));
                break;

            case '/':
                System.out.println("Result :" + (a/b));
                break;

            case '%' :
                System.out.println("Result :" + (a%b));
                break;


            default:
                throw new AssertionError();
        }

        sc.close();
    }
}