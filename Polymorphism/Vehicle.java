// Runtime polymorphism - Method Overriding
class Vehicle {
    public String move() {
        return "Vehicle is moving";
    }
}

class Car extends Vehicle {
    @Override
    public String move() {
        return "Car is moving on road";
    }
}

class Bike extends Vehicle {
    @Override
    public String move() {
        return "Bike is moving on road";
    }
}

class Bus extends Vehicle {
    @Override
    public String move() {
        return "Bus is carrying passengers";
    }
}

class VehicleDriver {
    public static void main(String[] args) {
        // Runtime polymorphism - parent reference, child object
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new Bike();
        Vehicle v4 = new Bus();
        
        // Method call resolved at runtime based on actual object type
        System.out.println(v1.move()); // Vehicle is moving
        System.out.println(v2.move()); // Car is moving on road
        System.out.println(v3.move()); // Bike is moving on road
        System.out.println(v4.move()); // Bus is carrying passengers
        
        // Demonstrating polymorphism with array
        System.out.println("\n--- Polymorphism with array ---");
        Vehicle[] vehicles = {new Vehicle(), new Car(), new Bike(), new Bus()};
        for (Vehicle v : vehicles) {
            System.out.println(v.move());
        }
    }
}