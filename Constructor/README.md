Constructor

what is meant by constructor ?

    A constructor in java is a special method that is automatically called when an object is created that initialized the object.

Types of Constructor,

    * Parameterized Constructor,
    * No - Aruguments Constructor.(Default Constructor)

* No - Aruguments Constructor.(Default Constructor),

    * A default constructor it does not have any parameterized
    * Its automatically called when an object is created without passing any arguments.

Example:
    class Demo{
        student(){
            System.out.println("Default constructor");
        }

    public static void main(String[] args){
        student s = new student();
    }

}

Advantages of default constructor,

    * Easy to create objects with default values,
    * Reduces repeated code,
    * Automatically initializes object values.

* Parameterized Constructor,

    * A parameterized constructor is a constructor that accepts one or more parameters.

    * It allows different object to have different values.

Example

    class Demo{
        int rollno;//non-static variable declaration
        String name;//non-static variable declaration

        Demo(int r, String n){ //Prameterized constructor
            rollno = r;
            name = n;
        }
        void display(){//non-static method
            System.out.println(rollno);
            System.out.println(name);
        }
        public static void main(String[] args){//main method
            Demo d =new Demo();//object creations
            d.display();//method calling using object reference
        }

    }

* Advantages of parameterized constructor,

    * Initialize objects with user values,
    * Improve Readability,
    * Reduces repeated codes,
    * Prevents uninitialized objects,
    * saves time.

* Rules of constructor,

    * The constructor has no return type,
    * The constructor is automatically called,
    * The constructor executes only once Per object.
    * The constructor name must be same as the class name.

what is meant by "this" ?
    * this  is a keyword and used to reference variable that refer the  current object class

what is meant by  Constructor Overloding ?

    * constructor overloading means creating multiple constructor same class with diffrent parameterized list
example :
    Camera(),

    Camera(int cameraId),

    Camera(int cameraId, String brand),

    Camera(int cameraId, String brand, double price).

Constructor chaining (this()) ?

    * The constructor chaining means used to call one constructor from another constructor in same class or parent class.

this(),

    call another constructor of the same class.

Important Rules,

    * The this() is first statement of the constructor in a class,
    * A constructor can call only one constructor directly call .