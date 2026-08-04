class AirConditioner{

        String acId;
        String brand;
        int capacity;
        double price; 
        
        public AirConditioner(){

        }
        public AirConditioner(String acId, String brand){
            this.acId = acId;
            this.brand = brand;
        }
        void displayAirConditioner(){
            System.out.println("ACID :"+acId);
            System.out.println("BRAND :"+brand);
            System.out.println("CAPACITY :"+capacity);
            System.out.println("PRICE :"+price);
        }

    public static void main(String[] args) {
        AirConditioner a = new AirConditioner();
        a.displayAirConditioner();
        AirConditioner a1 = new AirConditioner("121", "chemistry");
        a1.displayAirConditioner();

    }
}