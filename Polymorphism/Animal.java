//Choose your own real-world example, such as Animal/Dog/Cat, Vehicle/Car/Bike, 
// or Employee/Manager/Developer, and implement all 17 requirements in one Java program.

class Animal{

    String name;
    int age;
    String color;

    //1. Method Overloading
    public String animal(){
        return "Animal 1";
    }
    public String animal(String name,int age){
        return "age :"+age + "name :"+ name;
    }
    public String animal(String name, int age , String color){
        return "name : " + name+" " + "age :"+ age+" " + "color :"+ color;
    }

    private String animals(){//private method
        return "hi";
    }
    public void setanimals(){    //to access private method using getter and setter methods
    } //to access private method using getter and setter methods
    public String getanimals(){ //to access private method using getter and setter methods
        return animals(); //to access private method using getter and setter methods
    } //to access private method using getter and setter methods

    //constructor
    public Animal(String name , int age , String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Animal() {                   // constructor overloading
    }   // constructor overloading
    Animal(String name, int  age){  // constructor overloading
       this();  // constructor overloading
    }
    //static method
    public static void Animal(){

    }
}

class birds extends Animal{
    //2. Method Overriding
    //@Override
    public String animal(){
        return "Animal 2";
    }
    private String animals(){
        return "hii";
    }

    public birds(String name , int age , String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        
    }
    public static void birds(){
        
    }
    
}
class fly extends Animal{
    //2.method overriding-
    public String animal(){
        return "Animal 3";
    }

    public fly(String name , int age , String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
}
class Animaldriver{
    public static void main(String[] args) {
        //1.method overloading
        Animal a = new Animal("tiger",54,"yellow");  //here object reference for animal class is a       
        String b = a.animal("cat", 11); 
        System.out.println(a.animal());
        System.out.println(b); 
        String c = a.animal("cow", 15, "black");  
        System.out.println(c); 
        
        //2.method overriding

        Animal d = new birds("ants",21,"green");//upcasting explictly
       System.out.println(d.animal());
       Animal e = new fly("crow",32,"yellow");//object creation using new keyword for fly class
       System.out.println(e.animal());
    }
}