
import java.util.Scanner;

class Sumofdigits{
    public static void main(String[] args) {
        System.out.print("ENTER YOUR INPUTS NUMBER:");
        Scanner sc = new Scanner(System.in);////getting input from user
        int input = sc.nextInt();////getting input from user
        int temp = input;//getting input from user ,77
        int answer = 0;
        while(input > 0){//check the condition then move inside 
            answer =answer+ (input % 10);//0+(77%10)=7+0=7
            input = input/10;//7/10=0
            //System.out.println("sum of digits :"+answer);

        }
        System.out.println("sum of digits : "+answer);

    }
}