//5.Create a class Hotel with private fields hotelName (String, cannot be null or empty) and starRating (int, must be 1–5). Validate both setters properly — do NOT update if invalid. Test in main() with both valid and invalid values.

class Hotel{

    private String hotelname;
    public int starrating;

{
    if(hotelname == null || starrating >= 5 || starrating < 1 ){
        System.out.println("Input is Null Cannot Process ");
    }
   
 }

public String gethotelname(){
    return hotelname;
}
public void sethotelname(String hotelname){
    this.hotelname=hotelname;
}
public int getstarrating(){
    return starrating;
}
public void setstarrating(int starrating){
    this.starrating=starrating;
}
}