class College{

    String collegeName;
    String department;
    int cgpa;
    String year;

    void displayCollege(){
        System.out.println("collegeName :"+collegeName);
    
        System.out.println("departments :"+department);
        System.out.println("cgpa :"+cgpa);
        System.out.println("year :"+year);
    }

    public static void main(String[] args) {
       
        College c = new  College();
        c.cgpa = 8;
        c.collegeName = "PEC";
        c.department = "AIDS";
        c.year = "01/02/2026";

        c.displayCollege();


    }
}