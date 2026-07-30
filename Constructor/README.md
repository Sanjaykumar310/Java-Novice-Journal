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
