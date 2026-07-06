class Restaurantapp{
   public static void main(String[] args) {
       Dish d = new Dish();
       Bill b = new Bill();

       System.out.println(b.addDish());
       System.out.println("Total Price:" + b.calculateTotal(d));
       b.generateBill(d,001,"11/02/2026",11.00);
   }
}