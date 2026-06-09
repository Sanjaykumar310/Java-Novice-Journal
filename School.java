class School{
    private String schoolname;
    private String address;
    private String principal;
    private int noofstudents;

    public School(String schoolname,String address,String principal,int noofstudents) {
        this.schoolname=schoolname;
        this.address=address;
        this.principal=principal;
        this.noofstudents=noofstudents;
    }
    public String getschoolname(){//getter method
        return schoolname;
    }
    public String getaddress(){//getter methoad
        return address;
    }
    public String getprincipal(){//getter methoad
        return principal;
    }
    public int  getnoofstudents(){//getter methoad
        return noofstudents;
    }
    public void  setnoofstudents(int noofstudents){
        this.noofstudents=noofstudents;
        //return noofstudents;
    }
    public void setschoolname(){//setter methoad
        this.schoolname=schoolname;
    }
    
}