class Vehicle {

    static String brand = "Honda"; //SV

    String model;//NSV
    int speed;//NSV

    static {//MLSI
        System.out.println("Static Block");
    }

    {//MLNONSI
        System.out.println("Instance Block");
        speed = 40;
    }

    Vehicle() {//CONSTRUCTOR
        System.out.println("No-Argument Constructor");
        model = "City";
    }

    void display() {//NONSTATIC METHOD
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Speed : " + speed);
    }

    public static void main(String[] args) {

        System.out.println("Main Starts");

        Vehicle v1 = new Vehicle();

        v1.display();

        System.out.println("Main Ends");
    }
}