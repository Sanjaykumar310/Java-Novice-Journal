class TempConverter{
    public static void main(String[] args) {
        double celsius = 37.5;
        double fahrenheit = celsius*9.0/5+32;
        double kelvin = celsius + 273.15;

        System.out.println("Celsius :"+ celsius);
        System.out.println( "fahrenheit :"+fahrenheit);
        System.out.println("kelvin :"+kelvin);

    }
}