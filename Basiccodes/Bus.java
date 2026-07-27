class Bus{

    int BusNo;
    String Route;
    float Capacity;

    void displayBus(){
        System.out.println("BusNo :"+BusNo);
        System.out.println("Route :"+Route);
        System.out.println("Capacity :"+Capacity);
    }

    public static void main(String[] args) {

        Bus b = new Bus();
        b.BusNo = 123;
        b.Route = "chennai";
        b.Capacity = 7.5f;
        b.displayBus();
        
    }
}