class Employee{
    static String company = "wipro";//single line static initializer
    String ename = "ajay";//single line non-static initializer
    double salary ;//Non-static variable
    static {//multiline static initializer
        System.out.println("welcome to it");
    }
    {//multiline non-static initializer 
        salary = 10000;
        System.out.println("hello");
    }
    static String city;//static variable
    public static  void display()//static method
    {
        System.out.println("software testing");
    }

    public Employee() {//constractor
        //non-static context
    System.out.println("hi from employee");//local variable
    }
    public void print()//non-static method
    {
        String ename = "rakesh";
        System.out.println(ename);
        System.out.println("software development");
    }
    
    public static void main(String[] args) {//static method
        System.out.println("main start");
        Employee e1 = new Employee();//object creation
        String ename = "vijay";
        System.out.println(ename);
        System.out.println(e1.ename);
        e1.print();//non-static method calling using object reference 
        e1.display();//non-static method calling using object reference
        System.out.println(e1.salary);
        System.out.println("main end");
    }
}