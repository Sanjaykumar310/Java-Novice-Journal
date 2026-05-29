class Student {
    static String school = "GreenWood High";//single line static initilizer
    static int totalStudents = 0;//single line static initializer

    String name;//non-static variable
    int marks;//non-static variable

    static {//multiline static initializer
        System.out.println("School loaded: " + school);
    }

    {//multiline non-static initializer
        totalStudents++;
        System.out.println("Student block | count: " + totalStudents);
    }

    public Student() {//constractor
        this.name = "Unknown";
        this.marks = 0;
        System.out.println("Default constructor: " + this.name);
    }

    public Student(String name, int marks) {// parameterized constractor
        this.name = name;
        this.marks = marks;
        System.out.println("Param constructor: " + this.name);
    }

    public void show() {//non-static method
        String name = "Shadow";
        System.out.println("Local name: " + name);
        System.out.println("Instance name: " + this.name);
        System.out.println("Marks: " + marks);
    }

    public static void schoolInfo() {//static methoad
        System.out.println("School: " + school);
        System.out.println("Total: " + totalStudents);
    }

    public static void main(String[] args) {//static methoad,main method
        System.out.println("Main starts");

        Student s1 = new Student();//object creation
        Student s2 = new Student("Ravi", 95);

        s1.show();//non-static method callin using object reference
        s2.show();//non-static method callin using object reference

        Student.schoolInfo();//non-static method calling using object reference

        System.out.println("Main ends");
    }
}