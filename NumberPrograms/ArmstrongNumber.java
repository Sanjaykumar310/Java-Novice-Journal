
import java.util.Scanner;

class ArmstrongNumber{
    public static void main(String[] args) {
        System.out.println("ENTER YPUR NUMBER :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum =0;
        int digit = number;
        int numberofDigits = number;
        while(number > 0){
            sum += Math.pow(digit, numberofDigits);
        }
        System.out.println(sum);
    }
}