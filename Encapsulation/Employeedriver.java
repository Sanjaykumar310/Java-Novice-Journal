class Employeedriver{
    public static void main(String[] args) {
        Employee e1 = new Employee("kk", 252);
        System.out.println("Employee Name:"+e1.getname());
        System.out.println("Employee salary:"+e1.getsalary());
        //setsalary(458);
       // System.out.println("after updation:"+e1.getsalary());
       e1.setsalary(7000);
       System.out.println("after updation:"+e1.getsalary());
    }
}