class HeronArea{
    public static void main(String[] args) {
        double a = 5,b =6,c = 7;
        double s = (a+b+c)/2,area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Result :"+ area);
    }
}