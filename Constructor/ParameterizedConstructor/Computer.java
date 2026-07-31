class Computer{

        String brand;
        String processor;
        int ram;
        int storage;
        double price;

    public Computer(String brand,String processor,int  ram,int storage,double price) {
        this.brand = brand;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    void  Computer(){
        System.out.println("Brand :"+brand);
        System.out.println("Price :"+price);
        System.out.println("Processor :"+processor);
        System.out.println("Ram :"+ram);
        System.out.println("Storage :"+storage);
    }

    public static void main(String[] args) {
        Computer c = new Computer("asus", "amd", 12, 256, 1222200);
        c.Computer();
    }
}