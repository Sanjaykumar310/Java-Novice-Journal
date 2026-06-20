//Create abstract class Shape with abstract method area(). Create three subclasses: Circle, Rectangle, Triangle — each implementing area(). Store all three as Shape[] array and call area() in a loop. Print results.


abstract  class Shape{
    public abstract void area();
        //System.out.println("1st shape");
    

}
class Circle extends   Shape{

    @Override
    public  void area(){
        System.out.println("2nd shape");
    }
    
}
class Triangle extends   Shape{
    @Override
    public  void area(){
        System.out.println("3rd shape");
    }
    

}
class Rectangle extends   Shape{
    @Override
    public void area(){
        System.out.println("4th shape");
    }

}
class Shapedriver{
    public static void main(String[] args) {
        Shape[] s1= new  Shape[3];
        s1[0] = new Circle();
        s1[1] = new Triangle();
        s1[2] = new Rectangle();
        Shape s2 = new Shape();
        s2.area();

    }
}