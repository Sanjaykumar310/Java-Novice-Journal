class Teacher{

    int teacherId;
    String teacherName;
    String subject;
    double Salary;

    void Teacher(){
        System.out.println("TeacherId:"+teacherId);
        System.out.println("TeacherName:"+teacherName);
        System.out.println("Subject:"+subject);
        System.out.println("Salary:"+Salary);
    }
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.teacherId = 123;
        t.teacherName = "Komathi";
        t.subject = "English";
        t.Salary = 45000;

        t.Teacher();
    }
}