
import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        System.out.print("ENTER YOUR NUMBER :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
       for (int i = 1;i <= number ;i++) {
            fact = fact * i;
           
       }
       System.out.println("FACTORIAL NUMBER :"+fact);
    }
}