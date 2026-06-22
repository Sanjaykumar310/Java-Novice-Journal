
import java.util.Scanner;

class Digitcount{
    public static void main(String[] args) {
        System.out.print("ENTER YOUR INPUT DIGIT: ");//getting input from user
        Scanner sc = new Scanner(System.in);//getting input from user
        int input = sc.nextInt();//getting input from user
        
       // int temp  = input;//789
        int count = 0;      //initial stage 0,1,2,3
        while(input > 0){   //check the conditions and to find the digit we use the while loops
            input = input/10;   //789/10=78,78/10=7,7/10=0
            count++;            //increment the count until the condition satisfy

        }
        System.out.println("THE GIVE NUMBER  COUNT is :"+count);
    }
}