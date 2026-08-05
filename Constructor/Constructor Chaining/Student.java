class Student{

    int rollNo;
    String name;
    String department;
    int cgpa;
    String collegeName;

    public Student() {
        this(12);
    }
    Student(int rollNo){
        this(12,"kumar","aids");
    }
    Student(int rollNo, String name, String department){
        this(12,"kumar","aids",10,"PEC");
    }

    public Student(int rollNo, String name, String department, int cgpa, String collegeName) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        this.collegeName = collegeName;
    }
    
    void displayStudent(){
        System.out.println("RollNO :"+rollNo);
        System.out.println("Name :"+name);
        System.out.println("Department :"+department);
        System.out.println("CGPA :"+cgpa);
        System.out.println("CollegeName :"+collegeName);
    }
    

    public static void main(String[] args) {
        Student s = new Student();
        s.displayStudent();
        
    }
}