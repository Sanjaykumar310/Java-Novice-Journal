class Employee{

        int empId;
        String empName;
        double salary;

    public Employee() {
        empId = 1001;
        empName = "Rahul";
        salary = 5000;
    }
    void displayEmployee(){
        System.out.println("Employee ID:"+empId);
        System.out.println("Emploee Name:"+empName);
        System.out.println("Salary:"+salary);
    }
        

    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayEmployee();
    }
}