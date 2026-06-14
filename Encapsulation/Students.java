//Create a class Student with private fields: name, marks (int, 0–100), and grade (String — read-only, auto-calculated). When marks is set, grade should auto-update: 90+ = "A", 75–89 = "B", 60–74 = "C", below 60 = "F". There should be NO setter for grade. Test it in main().


class Students{
    private String name;//private variable access only getter.setter method
    private int marks;//private variable access only getter.setter method
    public char grade;//private variable access only getter.setter method

    public Students(String name,int marks){
        this.marks=marks;
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;

    }
    public  int getmarks(){//getter method read
        return marks;
    }
    public void setmarks(){//setter method read or update
        if(marks >=90 )
            grade = 'A';

        
        else if(grade >= 80)
            grade = 'B';
        
        else if(grade >= 70)
            grade = 'C';
        
        else if(grade >= 60)
            grade = 'D';
        else
            grade = 'F';

     public void studentdetails(int marks){//parameterized method

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very good");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                throw new AssertionError();
        }
        this.marks=marks;

        //TO CREATE THE DRIVER CLASS /OBJECT CREATION USE CALL METHODS FOR THIS CLASS
        }
    }
}