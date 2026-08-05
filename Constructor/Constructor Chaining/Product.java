class Product{

    int productId;
    String productName;
    int category;
    double price;
    int quantity;

    public Product() {
        this(12);
    }
    Product(int productId){
        this(12,"Laptop");
    }
    Product(int productId,String productName){
        this(12,"Laptop",1);
    }
    Product(int productId,String productName, int category){
        this(12,"Laptop",1,12000);
    }
    Product(int productId,String productName, int category,double price){
        this(12,"Laptop",1,12000,500);
    }
    public Product(int productId, String productName, int category, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct(){
        System.out.println("Product ID :"+productId);
        System.out.println("ProductName :"+productName);
        System.out.println("Category :"+category);
        System.out.println("Price :"+price);
        System.out.println("Quantity :"+quantity);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.displayProduct();
    }
}