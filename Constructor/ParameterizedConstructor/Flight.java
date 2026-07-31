class Flight{

    int flightId;
    String airline;
    String source;
    String destination;
    double ticketPrice;

    public Flight(int flightId,String airline,String souurce,String destination,double ticketPrice) {
        this.flightId = flightId;
        this.airline = airline;
        this.destination = destination;
        this.source = souurce;
        this.ticketPrice = ticketPrice;
        
    }
    void displayFlight(){
        System.out.println("Flight ID:"+flightId);
        System.out.println("Airline :"+airline);
        System.out.println("Destination :"+destination);
        System.out.println("Source :"+source);
        System.out.println("TicketPrice :"+ticketPrice);
    }



    public static void main(String[] args) {
        Flight f = new Flight(101,"airindia","chennai","indico",1572000);
        Flight f1 = new  Flight(002, "spciesjet", "tata", "coimbatore", 700000);

        f.displayFlight();
        System.out.println("==========2nd object=========");
        f1.displayFlight();
    }
}