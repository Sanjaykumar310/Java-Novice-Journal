class Laptop {

    static String brand = "Dell";//static initializer
    static int totalLaptops = 0;//static initializer

    String model;//non-static variable
    int price;//non-static variable

    static {//multiline-static initializer
        System.out.println("Brand: " + brand);
    }

    {//multiline-not-static initializer
        totalLaptops++;
        System.out.println("Laptop block. Total: " + totalLaptops);
    }

    public Laptop() {//no argument constructor
        this.model = "Basic";
        this.price = 30000;
        System.out.println("Default: " + this.model);
    }

    public Laptop(String model, int price) {//parameterizer constructor
        this.model = model;
        this.price = price;
        System.out.println("Param: " + this.model);
    }

    public void showDetails() {//non-static methoad
        String model = "Shadow";
        System.out.println("Local: " + model);
        System.out.println("Field: " + this.model);
        System.out.println("Price: " + this.price);
    }

    public static void laptopInfo() {//static methoad
        System.out.println("Brand: " + brand);
        System.out.println("Total: " + totalLaptops);
    }

    public static void main(String[] args) {//main methoad
        System.out.println("Main start");
        Laptop l1 = new Laptop();//object creation 
        Laptop l2 = new Laptop("Inspiron", 65000);
        l1.showDetails();//methoad calling using object reference
        l2.showDetails();//methoad calling using object refernce
        Laptop.laptopInfo();//methoad calling using class name reference
        System.out.println("Main end");
    }
}