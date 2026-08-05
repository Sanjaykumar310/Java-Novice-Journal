class Vehicle{

    int vehicleId;
    String brand;
    int model;
    double price;
    String ownerName;

    Vehicle(){
        this(100);
        System.out.println("Default constructor");
    }
    Vehicle(int vehicleId){
       this(100,"Royal Enfield",2017);
       this.vehicleId = vehicleId;

    }

     Vehicle(int vehicleId, String brand, int model) {
        this(100,"Royal Enfield",2017,25000,"Arun");
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
    }
    Vehicle(int vehicleId, String brand, int model,double price,String ownerName){
        this.brand = brand;
        this.model = model;
        this.ownerName = ownerName;
        this.vehicleId = vehicleId;
        this.price = price;
    }
    

   void Displaydetails(){
    System.out.println("Vehicle ID :"+vehicleId);
    System.out.println("Brand :"+brand);
    System.out.println("Model :"+model);
    System.out.println("Price :"+price);
    System.out.println("Owner Name :"+ownerName);

   }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.Displaydetails();
    }
}