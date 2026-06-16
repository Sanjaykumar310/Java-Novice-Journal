class Productdriver{
    public static void main(String[] args) {
        ElectronicProduct e1 = new ElectronicProduct();
        //e1.name="Laptop";
        //e1.price=50000;
        //e1.warranty=2;
        //System.out.println(e1.name = "Laptop");
        //System.out.println(e1.price=50000);
        //System.out.println(e1.warranty=2);
         e1.display("Laptop", 50000);
        e1.showwarranty(2);
       
    }
}