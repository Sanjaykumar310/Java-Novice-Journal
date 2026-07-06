class Dish{
    int d_id;
    int price;
    String name;
    String description;

    public static String search(){
        return "search";
    }

    public  int   sortByPrice(){//utility method
        int idliPrice = 20;
        int dosaPrice = 40;
        int PongalPrice = 50;

        int TotalPrice = idliPrice + dosaPrice + PongalPrice;
        return TotalPrice;
}}