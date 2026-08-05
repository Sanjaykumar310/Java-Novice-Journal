class Employee{

        int empId;
        String empName;
        String department;
        double salary;

        Employee(){
            this(121);
           
        }
        Employee(int empId){
            this("ram",121);
            
         }
         Employee(String empName,int empId){
            this(121,"ram","cse",122.2);
            this.empId = empId;
            
         }

         Employee(int empId, String empName, String department, double salary){

            this.empId = empId;
            this.empName = empName;
            this.department = department;
            this.salary = salary;
           
         }

         void displayEmployee(){
            System.out.println("Name :"+ empName);
            System.out.println("Emp ID:"+empId);
            System.out.println("Department :"+ department);
            System.out.println("Salary :"+salary);
         }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayEmployee();
        
    }
}