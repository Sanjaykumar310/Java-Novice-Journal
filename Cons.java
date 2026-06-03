class Cons {
    String brand;    // Instance variables (outside any method)
    int speed;
    double fuel;
    
    // CONSTRUCTOR (no return type, name matches class name)
    public Cons() {
        brand = "Unknown";
        speed = 100;
        fuel = 45.5;
    }
    
    public static void main(String[] args) {
        Cons c1 = new Cons();  // Constructor called automatically
        System.out.println(c1.brand);  // Output: Unknown
        System.out.println(c1.speed);   // Output: 100
        System.out.println(c1.fuel);    // Output: 45.5
    }
}