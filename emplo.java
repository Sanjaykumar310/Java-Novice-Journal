class emplo{
    private String name;
    private int rollno;
    private  double marks;

    public String getName(){//gettter method to read the data 
        return name;
    }
    public void setName(String name){//setter method to update or modify the data
        this.name=name;
    }
    public int getRollno(){//gettter method to read the data 
        return rollno;
    }
    public void setRollno(int rollno){//setter method to update or modify the data
        this.rollno=rollno;
    }
    public double getMarks(){//gettter method to read the data 
        return marks;
    }
    public void setMarks(double marks){//setter method to update or modify the data
        this.marks=marks;
    }
    public static void main(String[] args) {
        emplo e1 = new emplo();
    }
}