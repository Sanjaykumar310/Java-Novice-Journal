public class countthenumberofdigits {
    public static void main(String[] args) {
        int a =1234567890;
        int b=0;

        while (a>0) {
            a=a/2;
            b=b+1;
            
        }
        System.out.println(b);
    }
}
