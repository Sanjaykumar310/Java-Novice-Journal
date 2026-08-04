class Drone{

        int droneId;
        String brand;
        int range;
        double price;

    public Drone() {
    }

    public  Drone(int  droneId, String brand){
        this.brand = brand;
        this.droneId = droneId;

    }
    public Drone(int  droneId, String brand , int  range){
        this.brand = brand;
        this.droneId = droneId;
        this.range = range;
    }
    public  Drone(int droneId, String brand, int range, double  price){
        this.brand = brand;
        this.droneId = droneId;
        this.range = range;
        this.price = price;

    }

    void  displayDrone(){
        System.out.println("Drone ID :"+droneId);
        System.out.println("Brand :"+brand);
        System.out.println("Range :"+range);
    }

    

    public static void main(String[] args) {
        Drone d = new Drone(121, "canon", 500, 40000);
        System.out.println("FIRST PARAMETERIZED CONSTRUCTOR");
        d.displayDrone();

        System.err.println();

        Drone d1 = new Drone(122, "sony", 100);
        System.out.println("SECOND PARAMETERIZED CONSTRUCTOR");
        d1.displayDrone();
        
        System.err.println();

        Drone d2 = new Drone(123,"blackmagic",200);
        System.out.println("THIRD PARAMETERIZED CONSTRUCTOR");
        d2.displayDrone();
        
        
    }
}