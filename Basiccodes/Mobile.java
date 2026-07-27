class Mobile{

    String Brand;
    String Model;
    int Storage;
    double Price;

    void  displayMobile(){
        System.out.println("Brand:"+Brand);
        System.out.println("Model:"+Model);
        System.out.println("storage:"+Storage+"GB");
        System.out.println("Price:"+Price);
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();

        m.Brand = "Nothing";
        m.Model = "Nothing Phone 2 Pro";
        m.Storage = 256;
        m.Price = 19000;

        m.displayMobile();
    }
}