class Movie{
    String Title;
    String Hero;
    int Rating;

    void showMovie(){
        System.out.println( "Title :"+Title );
        System.out.println("Hero :"+Hero);
        System.out.println( "Rating :"+Rating );
    }
    
    public static void main(String[] args) {
        Movie m = new Movie();
        m.Hero = "Karthi";
        m.Rating = 5;
        m.Title ="Amaran";
        m.showMovie();
        
    }
}