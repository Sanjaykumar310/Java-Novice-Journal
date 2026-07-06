class Bill {

    //non-static variables 
    String dishes;
    int order_no ;
    String date;
    double time;

    //methoads
    public String addDish(){
        return "idli , dosa, Pongal";
    }

    public int   calculateTotal(Dish d){
        //int totalprice = price;
        return d.sortByPrice();
    }

    public void generateBill(Dish d,int order_no,String  date,double  time){
        System.out.println("Order no :" + order_no);
        System.out.println("Date :" + date);
        System.out.println("Time :" + time);
        System.out.println("Dish List :" + addDish());
        System.out.println("Total Price :" + calculateTotal(d));
    }
}