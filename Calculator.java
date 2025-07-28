import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;::

        
                op == '*' ? a * b :
                op == '/' ? (b != 0 ? a / b : "Error: Cannot divide by zero") :
                "Error: Invalid operator"
            ));

            System.out.print("Do you want to calculate again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator exited.");
        sc.close();
    }
}
