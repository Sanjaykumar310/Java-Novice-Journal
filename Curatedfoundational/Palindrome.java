
import java.util.Scanner;

/*9. Palindrome Check
Write a method isPalindrome(int n) that checks if a number is a palindrome (e.g., 121 → true). */
class Palindrome {
    public boolean isPalindrome(int number) {
        int temp = number;
        int original = 0;
        int digit;
        while (number > 0) {
            digit = number % 10; // extract the last digit
            original = original * 10 + digit; // to reverse it
            number = number / 10; // to remove the last digit
        }
        return original == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR INPUT:");
        int number = sc.nextInt();
        Palindrome p = new Palindrome();
        boolean result = p.isPalindrome(number);
        System.out.println(result);
        sc.close();
    }
}