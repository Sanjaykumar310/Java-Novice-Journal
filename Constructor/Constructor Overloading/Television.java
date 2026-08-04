class Television{

        int tvId;
        String brand;
        int screenSize;
        double price;

public Television(){

}

public Television(int  tvId,String brand,int  screenSize){
    this.brand = brand;
    this.tvId = tvId;
    this.screenSize = screenSize;
}
public Television(int tvId,String brand,int screenSize,double price){
    this.brand = brand;
    this.price = price;
    this.screenSize = screenSize;
    this.price = price;
}

    void displayTelevision(){
        System.out.println("TV ID:"+tvId);
        System.out.println("BRAND :"+brand);
        System.out.println("PRICE :"+price);
        System.out.println("SCREENSIZE :"+screenSize);
    }
    public static void main(String[] args) {
        Television t = new Television();
        t.displayTelevision();
        Television t1 = new Television(11, "GOOGLE", 121);
        t1 .displayTelevision();

        
        
    }
}