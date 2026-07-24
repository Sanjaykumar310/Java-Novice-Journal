public class Student{
    int Rollno;
    String Name;
    String Department;
   

    public static void main(String[] args) {
        Student s = new Student(); // object creation
        s.Rollno = 1212;
        s.Name = "sam";
        s.Department = "cse";

       displaydetails(s. Rollno,s.Name,s.Department);
    }
    public  static void displaydetails(int Rollno,String Name,String Department){
        System.out.println(Rollno);
        System.out.println(Name);
        System.out.println(Department);
        
    }
}