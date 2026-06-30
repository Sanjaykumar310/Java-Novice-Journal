//Write a program to swap two variables with using third variable?

class Swap{
    public static void  swap(int a,int b){
        a=b;
        int temp = a;
        temp = b; 
        
        System.out.println("After swapping");
        System.out.println("a ="+a);
        System.out.println("b="+b);
    }
    public static void main(String[] args) {
     
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping");
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        swap(a, b);
    }
}