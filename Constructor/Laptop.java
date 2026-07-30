class Laptop{

    String brand;
    String processor;
    int ram;
    double price;

    public Laptop() {
         brand = "Dell";
         processor = "Intel i5";
         ram = 16;
         price = 6500;
    }

    void  displayLaptop(){
        System.out.println("Brand :"+brand);
        System.out.println("Processor :"+processor);
        System.out.println("Ram :"+ram);
        System.out.println("Price :"+price);
    }

    public static void main(String[] args) {
        Laptop l = new  Laptop();
        l.displayLaptop();
        
    }
}