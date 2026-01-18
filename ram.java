
import java.util.Scanner;

//Student Grade Calculator
public class ram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR 5 SUBJECTS MARKS : ");
       

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d =  sc.nextInt();
        int e = sc.nextInt();

        int total = (a+b+c+d+e);
        System.out.println("TOTAL :"+total);



        int result = (total)/5;

        System.out.println("AVERAGE : "+result);

        if(result >= 50){
            System.out.println("RESULT :PASS");
            System.out.println("GRADE : A");
        }
        else if (result >= 80){
            System.out.println("RESULT :PASS");
            System.out.println("GRADE : B");
        }
        else if (result >= 90) {
            System.out.println("RESULT : PASS");
            System.out.println("GRADE : C");
            
        }
        else {
            System.out.println("RESULT : PASS");
            System.out.println("Grade : F");
        }
        
       
        sc.close();
        
    }
}