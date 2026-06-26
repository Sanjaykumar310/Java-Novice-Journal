abstract class Vehicle{
        abstract void getType();
}

class Car extends Vehicle {
    @Override
    void getType(){
        System.out.println("Car is started");
    }
}
class Bike extends Vehicle{
    @Override
    void getType(){
        System.out.println("Bike is Started");
    }
}
class Truck extends Vehicle{
    @Override
    void getType(){
        System.out.println("Truck is Started");
    }
    
}