class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        if(name == null || name.length() == 0){
            System.out.println("INVALID INPUT");
        }
        else{
            System.out.println("Valid input");
            this.name = name;
        }
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        if(age <= 120 && age >= 1){
            System.out.println("valid input");
        }
        else{
            System.out.println("invalid input");
        }
        this.age=age;
    }
}