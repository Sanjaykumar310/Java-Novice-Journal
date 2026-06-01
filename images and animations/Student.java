class Student {

    static String schoolName = "ABC School";//single line static initializer
    static int totalStudents = 0;//single line static initializer

    String name;//non-static variable
    String grade;//non-static variable
    int marks;//non-static variable

    static {//multiline static initializer
        System.out.println("School: " + schoolName);
        System.out.println("System Ready!");
    }

    {//non-static multiline initializer
        totalStudents++;
        System.out.println("Student block. Total: " + totalStudents);
    }

    public Student() {//constructor
        this.name = "Unknown";
        this.grade = "A";
        this.marks = 50;
        System.out.println("Default student: " + this.name);
    }

    public Student(String name, String grade, int marks) {//parameterized constructor
        this.name = name;
        this.grade = grade;
        this.marks = marks;
        System.out.println("Param student: " + this.name);
    }

    public void showDetails() {//nonstatic methoad
        String name = "Dummy";
        System.out.println("Local: " + name);
        System.out.println("Field: " + this.name);
        System.out.println("Grade: " + this.grade);
        System.out.println("Marks: " + this.marks);
    }

    public static void schoolInfo() {//static methoad
        System.out.println("School: " + schoolName);
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        System.out.println("Main start");
        Student s1 = new Student();
        Student s2 = new Student("Arun", "B", 75);
        Student s3 = new Student("Meena", "A", 95);
        Student s4 = new Student();
        s1.showDetails();
        s3.showDetails();
        Student.schoolInfo();
        System.out.println("Main end");
    }
}