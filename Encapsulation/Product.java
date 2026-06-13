//Create a class Product with private fields: name (String), price (double), and discount (double, 0–100%). Add a method getFinalPrice() that returns price - (price * discount / 100). Validate all setters. In main(), create 2 products and print their final prices.


class Product{
    private String name;
    private double price;
    public double discount;

    public Product(String name,double price,double discount){
        this.name=name;
        this.price=price;
        this.discount=discount;

    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double price){
        if(price > 100){
            System.out.println("valid");

        }
        else{
            System.out.println("not vaalid");
        }
        this.price=price;

    }
    public double getFinalPrice(){
        return (price*discount/100);
    }

}