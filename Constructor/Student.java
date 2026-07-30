//to create default constructor
class Student{

    int RollNo;
    String name;
    String department;

    public Student() {//default constructor
        RollNo = 101;//assigining the values
        name = "sam";//assigining the values
        department = "AIDS";//assigining the values
    }
void display(){//method
    System.out.println("RollNo:"+RollNo);
    System.out.println("Name:"+name);
    System.out.println("Department:"+department);
}
    

    public static void main(String[] args) {
        Student s = new Student();

        s.display();

    }
}