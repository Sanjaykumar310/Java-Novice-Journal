import java.util.Scanner;
class Reversenumber{
    public static void main(String[] args) {
        System.out.print("ENTER YOUR INPUT :");
        Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int rev = 0;
       while(number > 0){
            int digit = number % 10;
             rev = rev*10 + digit;
            number = number / 10;
       }
       System.out.println("REVERSED NUMBER :"+rev);
    }
}