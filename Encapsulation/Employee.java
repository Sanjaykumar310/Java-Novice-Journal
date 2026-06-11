//Create a class Employee with private fields name (String) and salary (double). In the salary setter, validate: salary must be >= 5000. If not, print "Invalid salary" and don't update. Test with valid and invalid values.

class Employee{

    private String name;
    private double salary;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public String getname(){//read only
        return name;
    }
    public void setname(String name){//read and modify the data
        this.name=name;

    }
    public void setsalary(double salary){
        if(salary >= 5000){
            System.out.println("Invalid Salary");

        }
        else{
            System.out.println("valid salary");

        }
        this.salary=salary;
    }
    public double getsalary(){
        return salary;
    }
    
}