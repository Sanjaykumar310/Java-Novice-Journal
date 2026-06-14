//Create a class Ticket with private fields: movieName (String), seatNumber (int, 1–200), and category (String — read-only, auto-set based on seatNumber). When seatNumber is set: 1–50 = "VIP", 51–150 = "Normal", 151–200 = "Balcony". There should be NO setter for category. Test in main().


class Ticket{
    private String moviename;
    public int seatnumber;
    private String category;

    public String getmoviename(){
        return moviename;
    }
    public String getcategory(){
        return category;
    }
    public void movidetails(int seatnumber){
        if(seatnumber <= 50){

           System.out.println("VIP");
        }
        else if(seatnumber <= 150){
            System.out.println("Normal");
        }
        else{
            System.out.println("Balcony");
        }
    }
}