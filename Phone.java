class Phone {

    static String brand = "Samsung";    //single line static initializer
    static int totalPhones = 0;         //single line static initializer

    String model;//non-static variable
    int price;//non-static variable

    static {                            //multiline static initializer
        System.out.println("Brand: " + brand);
    }

    {//multiline non-static initializer
        totalPhones++;
        System.out.println("Phone created. Total: " + totalPhones);
    }

    public Phone() {                                                    //no-argument constructor
        model = "Unknown";
        price = 0;
        System.out.println("Default phone: " + model);
    }

    public Phone(String model, int price) {                             //parameterized constructor
        model = model;
        price = price;
        System.out.println("Param phone: " + model);
    }

    public void showDetails() {//non-static method
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void brandInfo() {                    //static method
        System.out.println("Brand: " + brand);
        System.out.println("Total Phones: " + totalPhones);
    }

    public static void main(String[] args) {        //static method
        System.out.println("Main start");

        Phone p1 = new Phone();
        Phone p2 = new Phone("Galaxy S24", 80000);

        p1.showDetails();
        p2.showDetails();

        Phone.brandInfo();//static-method calling

        System.out.println("Main end");
    }
}