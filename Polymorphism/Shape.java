class Shape{
    public String draw(){
        return "Drawing shape";
    }
}
class Circle extends Shape{
    @Override
    public String draw(){
        return "Drawing circle";
    }
}
class Triangle extends Shape{
    @Override
    public String draw(){
        return "Drawing triangle";
    }
}
class Square extends Shape{
    @Override
    public String draw(){
        return "Drawing square";
    }
}
class Shapedriver{
    public static void main(String[] args) {
       Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Square();

for(int i = 0; i < shapes.length; i++) {
    shapes[i].draw();
    System.out.println(shapes[i].draw());
}
    }
}