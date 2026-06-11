//Create a class Circle with a private field radius (double). In the setter, add validation: if radius is negative, set it to 0. In main(), try setting radius to -5 and print the result.

class Circle{
    private double radius;//private variable

    public void setRadius(){//non-static methoad
        if(radius > 0){
            System.out.println("VALIDE DATA");
        }
        else{
            System.out.println("RADIUS MUST BE POSITIVE");
        }
        this.radius=radius;

    }
    public double getRadius(double radius){//getter methoad and read only
        return radius;
    }

}