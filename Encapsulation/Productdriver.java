class Productdriver{
    public static void main(String[] args) {
        Product p1 = new Product("hellobro", 458, 10);
        Product p2 = new Product("hi", 78, 20);

        System.out.println("FIRSTFINALPRICE:"+p1.getFinalPrice());
        System.out.println("SECONDFINALPRICE:"+p2.getFinalPrice());
    }
}