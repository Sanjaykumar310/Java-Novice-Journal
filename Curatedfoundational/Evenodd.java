/*2. Even or Odd
Write a method checkEvenOdd(int n) that prints whether n is even or odd. */
class Evenodd{
    public int  evenorodd(int a){
        if(a > 0){
            if(a % 2== 0){
            System.out.println("EVEN NUMBER");
        }
    }
        else{
            System.out.println("odd Number");
        }
        return a;
    }
    public static void main(String[] args) {
        Evenodd e = new Evenodd();
        System.out.println("GIVEN NUMBER:"+e.evenorodd(8));
        
    }
}