class Studentsdriver{
    public static void main(String[] args) {
        Students s1 = new Students("ram", 65);
        s1.getname();
        s1.getmarks();
        System.out.println("name:"+s1.getname());
        System.out.println("marks:"+s1.getmarks());
        s1.studentdetails(45);
    }
}