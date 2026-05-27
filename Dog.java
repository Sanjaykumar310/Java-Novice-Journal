class Dog{
    String name;
    String breed;
    public  void introduce(){
        System.out.println("Hi I am "+name+" and i am a "+breed);
    }

    public static void main(String[] args) {
        Dog D1 = new Dog();
        D1.dogdetailes();
        D1.introduce();
        Dog D2 = new  Dog();
        D2.dogdetailes();
        D2.introduce();
       
    }
    public void dogdetailes(){
        System.out.println("DOG NAME:"+name);
        System.out.println("DOG BREED:"+breed);
    }
}