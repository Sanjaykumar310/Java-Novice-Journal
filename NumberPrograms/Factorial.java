
import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        System.out.println("ENTER YOUR NUMBER :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = number;
        int i ;
        while(number > 0){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}