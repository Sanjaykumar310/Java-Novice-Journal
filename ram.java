
import java.util.Scanner;
import java.util.jar.Attributes;
import java.util.Arrays;



public class ram{

    private static void  studentname (String[] name){
                Scanner sc = new Scanner(System.in);
                String student = sc.nextLine();
                System.out.println("enter your name");
                for (int i = 0; i < name.length; i++) {
                    student += name[i];
                    System.out.println(name);
                }
                
            }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR FIRST NAME :");
        String a = sc.nextLine();


        //String stu = studentname(name);
        System.out.print(studentname(name));

       
        
       
         sc.close();
    }
} 