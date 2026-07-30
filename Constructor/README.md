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