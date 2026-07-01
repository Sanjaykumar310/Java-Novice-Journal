/*10. Simple Calculator
Write a method calculate(int a, int b, char operator) that performs +, -, *, / based on the operator and returns the result. */
class Calculator{
    public void calculate(int a,int b,char operator){
        
        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                throw new AssertionError();
        }
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        //System.out.println(c.calculate(5, 5, '-'));
        c.calculate(5, 5, '-');
    }
}