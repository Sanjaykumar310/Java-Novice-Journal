class Calculator{

    public void area(double radius){
        System.out.println("circle area");
    }
    public void area(double length,double width){
        System.out.println("rectangle area");
    }
    public void area(double base,double height,boolean isTriangle){
        System.out.println("triangle area");
    }
}

class Calculatordriver{
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.area(45);
        c1.area(45, 78);
        c1.area(42, 45, true);
    }
}