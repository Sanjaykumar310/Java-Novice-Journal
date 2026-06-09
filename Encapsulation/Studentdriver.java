

class Studentdriver{
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("NAME : "+s1.getname());
        System.out.println("AGE :"+s1.getage());
        s1.setage(22);
        System.out.println("AFTER UPDATE THE AGE:"+s1.getage());
        s1.setname("hello bro");
         System.out.println("AFTER UPDATE THE NAME:"+s1.getname());
    }
}