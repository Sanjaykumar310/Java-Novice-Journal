class Bicycle{
    
        int cycleId;
        String brand;
        String type;
        double price;

    Bicycle(int cycleId,String brand,String type,double price){
       this.cycleId = cycleId;
        this.brand = brand;
       this. type = type;
       this. price = price;
    }

    void displayBicycle() {
    System.out.println("Cycle ID : " + cycleId);
    System.out.println("Brand : " + brand);
    System.out.println("Type : " + type);
    System.out.println("Price : " + price);
}
    

    public static void main(String[] args) {
        Bicycle b = new Bicycle(101, "giant", "vehicle", 15000);
       
        b.displayBicycle();
        
    }
}