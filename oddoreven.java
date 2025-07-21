import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {

        System.out.println("ENTER A NUMBER:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=1;i++){
            if (n%2==0) {
            System.out.println("even");
        }   

        }
        if (n>0) {
            System.out.println("odd");
            
        }
       
        
        sc.close();


    }
    
}
