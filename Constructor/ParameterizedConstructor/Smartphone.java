class Smartphone{


        String brand;
        String model;
        int storage;
        double price;

    public Smartphone(String brand,String model,int  storage,double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;

    }

        

        void displayPhone(){
            System.out.println("Brand :"+brand);
            System.out.println("Model :"+model);
            System.out.println("Storage :"+storage);
            System.out.println("Price :"+price);
        }
    public static void main(String[] args) {
        Smartphone p = new Smartphone("vivo", "v17", 256, 154700);
        p.displayPhone();
    }
}