class Restaurant{

        int restaurantId;
        String restaurantName;
        String location;
        double rating;

    public Restaurant(int restaurantId,String restaurantName,String location,double rating) {
        this.location = location;
        this.rating =rating;
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
    }

      void displayHotel(){
        System.out.println("Restaurant ID :"+restaurantId);
        System.out.println("RestaurantName :"+restaurantName);
        System.out.println("Location :"+location);
        System.out.println("Rating :"+rating);
      }  

    public static void main(String[] args) {

        Restaurant r = new Restaurant(121, "A2B", "Chenai", 5);
        r.displayHotel();
        
    }
}