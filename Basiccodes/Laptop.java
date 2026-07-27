class Laptop{

    String Brand;
    String Processor;
    int Ram;
    double price;

   public  void display(){
        System.out.println("Brand :"+Brand  );
        System.out.println( "Processor :"+Processor );
        System.out.println("Ram :"+Ram+"GB");
        System.out.println("Price :"+price );
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.Brand = "Dell";
        l.Processor = "Intel i5";
        l.Ram = 16;
        l.price = 65000;

        l.display();
    }
}