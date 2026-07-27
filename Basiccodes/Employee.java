class Employee{
    int empid;
    String name;
    float salary;


    public static void Display_employee_details(int empid,String name,float salary){
        System.out.println(empid);
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.empid = 12;
        e.name = "ram";
        e.salary = 12.0f;

        Display_employee_details(e.empid,e.name,e.salary);
    }
}