class Printer{
    public String print(String msg){
        return "String:"+msg;
    }
    public String print(int num){
        return "Integer:"+num;
    }
    public String print(String msg,int times){
        return "Number of times:"+times;
    }
}

class Printerdriver{
    public static void main(String[] args) {
        Printer p1 = new Printer();
        System.out.println(p1.print("hi"));
        System.out.println(p1.print(4));
        System.out.println(p1.print("hello", 45));
    }
}