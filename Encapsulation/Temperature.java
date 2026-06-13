//Create a class Temperature with a private field celsius (double). In the setter, validate: celsius must be above -273 (absolute zero). If invalid, print "Below absolute zero" and do NOT update. In main(), test with -300 and 37.


class Temperature{

    private double celsius;


    public void setcelsius(double celsius){
        if(celsius > 0){
            System.out.println("validate celsius");
        }
        else{
            System.out.println("Below absolute zero");
        }
    }
}