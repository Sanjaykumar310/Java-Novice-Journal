class Keyboard{

    Keyboard(){
        this("hello");
        
        System.out.println("Default constructor");
    }
    Keyboard(String a){
        System.out.println("Greeting :"+ a);
    }

    public static void main(String[] args) {
        Keyboard k = new Keyboard();
    }
}