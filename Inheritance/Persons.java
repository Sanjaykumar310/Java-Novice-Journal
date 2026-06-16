/*Person class → field name, method introduce() prints "Hi, I am [name]"
Teacher extends Person → field subject, method teach() prints "I teach [subject]"
MathTeacher extends Teacher → override teach() prints "I teach Mathematics at advanced level" and call super.teach() inside it

In main, create MathTeacher object, set name="Raj", subject="Math", call all 3 methods.*/

class Persons{
    String name;
    public void introduce(){
        System.out.println("Hi,I am sanjay");
    }
}