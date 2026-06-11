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

    
}