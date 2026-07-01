/*1. Sum of Two Numbers
Write a method sum(int a, int b) that returns the sum and print the result in main. */
class Sum{
    public int sum(int a,int b){//methodcreation
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        Sum s = new Sum();
        //s.sum(5, 5);
        System.out.println(s.sum(4, 5));
    }
}