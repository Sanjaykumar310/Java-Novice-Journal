/*9. Palindrome Check
Write a method isPalindrome(int n) that checks if a number is a palindrome (e.g., 121 → true). */
class Palindrome{
    public int isPalindrome(int number){
        
        int original = 
        int digit =0;
        while(number > 0){
            
             digit = number % 10;//exctract the last digit
             original = number * 10 + digit;//to reverse it
             number = number / 10;//to remove the last digits
        
        }
        if(original == number){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        return number;
    }
    
}