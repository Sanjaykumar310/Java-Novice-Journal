//Create a class Student with private fields name (String) and age (int). Write public getter and setter methods for both. In main(), create a Student object, set the values, and print them.

class Student{
    private String name;
    int age;

    
    public void  setname(String name){
        this.name=name;

    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public void  setage(int age){
        this.age=age;
    }
}