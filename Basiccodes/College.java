
import java.util.Scanner;

class College{

    String collegeName;
    String department;
    int cgpa;
    String year;

    void displayCollege(){
        System.out.println("collegeName"+collegeName);
        collegeName = sc.nextLine();
        System.out.println("departments"+department);
        System.out.println("cgpa"+cgpa);
        System.out.println("year"+year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        College c = new  College();


    }
}