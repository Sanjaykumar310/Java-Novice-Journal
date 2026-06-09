class Schooldriver{
    public static void main(String[] args) {
        School s1 = new School("PEC","POONAMALLE","CHINNADURAI",2000);
        System.out.println("SCHOOL NAME :"+s1.getschoolname());
        System.out.println("SCHOOL ADDRESS :"+s1.getaddress());
        System.out.println("SCHOOL PRINCIPAL:"+s1.getprincipal());
        System.out.println("NO OF STUDENTS:"+s1.getnoofstudents());

        s1.setnoofstudents(5000);
        System.out.println("UPDATED NO OF STUDENTS :"+s1.getnoofstudents());

    }
}