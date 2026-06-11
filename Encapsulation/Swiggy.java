class Swiggy{
    private String hotelname;
    private String hoteladdress;
    private String hotelowner;
    private double bill;

    public Swiggy(String hotelname,String hoteladdress,String hotelowner,double bill) {
        this.hotelname=hotelname;
        this.hoteladdress=hoteladdress;
        this.hotelowner=hotelowner;
        this.bill=bill;
    }
    public String gethotelname(){
        return hotelname;
    }
    public void sethotelname(String hotelname){
        this.hotelname=hotelname;
    }
    public String gethoteladdress(){
        return hoteladdress;
    }
    public void sethoteladdress(String hoteladdress){
        this.hoteladdress=hoteladdress;
    }
    public String gethotelowner(){
        return hotelowner;
    }
    public void sethotelowner(String hotelowner){
        this.hotelowner=hotelowner;
    }
    public double getbill(){
        return bill;
    }
    public void setbill(double bill){
        this.bill=bill;
    }
    public void Hoteldetails(){
        System.out.println("HOTEL NAME:"+hotelname);
        System.out.println("HOTEL ADDRESS:"+hoteladdress);
        System.out.println("HOTELOWNER:"+hotelowner);
        System.out.println("FOOD PRICE:"+bill);
    }

    
}