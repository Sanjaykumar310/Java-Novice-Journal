class Camera{

        int cameraId;
        String brand;
        double price;

    public Camera() {
         cameraId = 0;
            brand = "Unknown";
            price = 0.0;

    }
    public Camera(int cameraId){
        this.cameraId = cameraId;

    }
    public Camera(int cameraId, String brand){
        this.cameraId = cameraId;
        this.brand = brand;
    }
    public Camera(int cameraId, String brand,double price){
        this.cameraId = cameraId;
        this.brand = brand;
        this.price = price;
 }
        

    void displayCamer(){
        System.out.println("camera ID:"+cameraId);
        System.out.println("Brand :"+brand);
        System.out.println("Price :"+price);
    }
    public static void main(String[] args) {
        Camera c = new Camera(121,"sony",15000.0);
        c.displayCamer();
        
    }
}