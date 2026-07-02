
import java.util.Scanner;

//Write a method isPrime(int n) that returns true if n is prime, else false.
class Checkprime{
    public static void main(String[] args) {
        System.out.print("ENTER YOUR NUMBER:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Checkprime p = new Checkprime();
         p.isPrime(number);
        //System.out.println();
        sc.close();
    }
    public void   isPrime(int number){
        if(number > 0 && number % 2 == 0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
       // return true;

    }
    
}