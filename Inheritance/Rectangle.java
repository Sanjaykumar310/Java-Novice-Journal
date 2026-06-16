//Create a class Rectangle that overrides area() and prints "Area of Rectangle = l × b".

class Rectangle extends Circle{
    @Override// Method Overriding
    public void area(){
        System.out.println("Rectangle area");
    }
}