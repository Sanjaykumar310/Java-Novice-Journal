class Vehicle{
    
    String brand;
    String color;

void start(){
    System.out.println("Vehicle is starting");
}

}

class Car extends Vehicle{

    int numberOfDoors;

void drive(){
    System.out.println("Car is driving");
}

}

class Vehicledriver{
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "innova";
        c.color = "black";
        c.start();
        c.drive();
    }
}