//Write a program to swap two variables without using another variable?
class Swap1{
    public static void swap(int a,int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping");
        System.out.println("a ="+a);
        System.out.println("b ="+b);

    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swaping");
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        swap(a, b);
    }
}