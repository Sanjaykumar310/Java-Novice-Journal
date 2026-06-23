
import java.util.Scanner;

class Palindromenumber{
    public static void main(String[] args) {
        System.out.print("ENTER YOUR INPUT :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = number;
        //while(number > 0){
        if(number > 0){
            if(number == rev){
                System.out.println("Palindrome Number");

            }
            else{
                System.out.println("Not A Palindrome Number");
            }
        }

        //}
    }
}