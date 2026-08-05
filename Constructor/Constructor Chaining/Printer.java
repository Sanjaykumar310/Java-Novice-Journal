class Printer{

    Printer(){
        this(101);
        System.out.println("Default constructor");
    }
    Printer(int id){
        System.out.println("ID :"+ id);
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        
    }
}