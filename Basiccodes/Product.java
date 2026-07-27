class Product{

    int ProductId;
    String ProdutName;
    double Price;
    int Quantity;

    void displayProduct(){
        System.out.println("ProductId:"+ProductId);
        System.out.println("ProductName:"+ProdutName);
        System.out.println("Price:"+Price);
        System.out.println("Quantity:"+Quantity);
    }

    public static void main(String[] args) {

        Product p = new Product();
        p.Price=124;
        p.ProductId = 12;
        p.ProdutName = "Robo";
        p.Quantity = 125;

        p.displayProduct();
    }
}