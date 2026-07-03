
import java.util.Scanner;

//Write a method reverseNumber(int n) that returns the reverse of the number (e.g., 123 → 321).

class Reverse{
    public static void main(String[] args) {
        System.out.print("ENTER YOUR INPUT:");
        Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
        Reverse r = new Reverse();
         
        System.out.println("Reversed Number :"+r.reverseNumber(number));
        sc.close();
    }
    public int  reverseNumber(int number){
        int reverse = 0;
        while( number > 0){
            int digit =  number % 10;
             reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return reverse;
    }
}