class Employee{
    static String company = "wipro";
    String ename = "ajay";
    double salary ;
    static {
        System.out.println("welcome to it");
    }
    {
        salary = 10000;
        System.out.println("hello");
    }
    static String city;
    public static  void display()
    {
        System.out.println("software testing");
    }

    public Employee() {
    System.out.println("hi from employee");
    }
    public void print()
    {
        String ename = "rakesh";
        System.out.println(ename);
        System.out.println("software development");
    }
    
    public static void main(String[] args) {
        System.out.println("main start");
        Employee e1 = new Employee();
        String ename = "vijay";
        System.out.println(ename);
        System.out.println(e1.ename);
        e1.print();
        e1.display();
        System.out.println(e1.salary);
        System.out.println("main end");
    }
}