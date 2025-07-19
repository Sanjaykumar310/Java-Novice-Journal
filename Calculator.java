import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("ENTER FIRST NUMBER: ");
            double a = sc.nextDouble();

            System.out.print("ENTER SECOND NUMBER: ");
            double b = sc.nextDouble();

            System.out.print("ENTER OPERATOR (+, -, *, /): ");
            char op = sc.next().charAt(0);

            // Calculate result using ternary operator
            System.out.println("Result: " + (
                op == '+' ? a + b :
                op == '-' ? a - b :
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
