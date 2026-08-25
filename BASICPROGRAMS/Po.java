
import java.util.Scanner;

//Positive or Negative

class Po{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0 ){
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }
    }
}

//2. Even or Odd

class Even{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if(m % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
//. Swap Two Numbers WITHOUT Third Variable
class Swap{
    public static void main(String[] args) {
        int a  = 5 , b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a+ " b ="+b);
    }
}
//4. Swap Two Numbers WITH Third Variable
class Swap1{
    public static void main(String[] args) {
        int a1 = 12 , b1 = 20, temp;
        temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("a ="+a1+ " b ="+b1);
    }
}

//Multiplication Table
class Mul{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

//6. Last Digit / Remainder

class Last{
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int l = n % 10;
        System.out.println(l);
    }
}