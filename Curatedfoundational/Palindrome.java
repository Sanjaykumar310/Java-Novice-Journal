
import java.util.Scanner;

/*9. Palindrome Check
Write a method isPalindrome(int n) that checks if a number is a palindrome (e.g., 121 → true). */
class Palindrome{
    public int isPalindrome(){
        System.out.print("ENTER YOUR INPUT:");
        Scanner sc = new Scanner(System.in);
        
        int original = 0;
        int digit =0;
        int number = sc.nextInt();
        while(number > 0){
            
             digit = number % 10;//exctract the last digit
             original = original * 10 + digit;//to reverse it
             number = number / 10;//to remove the last digits
        
        }
        if(original == number){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        return boolean;
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.isPalindrome();
       
    }
    
}