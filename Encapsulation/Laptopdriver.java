class Laptopdriver{
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setbrand("Dell");
        l1.setprice(55000);

        System.out.println("Laptop Brand:"+l1.getbrand());
        System.out.println("Laptop Price:"+l1.getprice());
    }
}