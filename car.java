class car{
    String brand;
    int speed;

    public car() {
    }
    public  car(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
        System.out.println("Brand :"+brand);
        System.out.println("Speed :"+speed);
    }
    public void showDetails(){
         System.out.println("Brand :"+brand);
        System.out.println("Speed :"+speed);
    }
}