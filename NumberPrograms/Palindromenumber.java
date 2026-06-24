
import java.util.Scanner;

class Palindromenumber{
    public static void main(String[] args) {
        System.out.print("ENTER YOUR INPUT :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0;
        int original = number;

        while(number > 0){
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;

        }
        if(original == rev){
            System.out.println("Palindrome Number ");
        }
        else{
            System.out.println("not a palindrome");
        }

       
    }
}
