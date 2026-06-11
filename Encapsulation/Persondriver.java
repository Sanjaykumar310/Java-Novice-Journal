class Persondriver{
    public static void main(String[] args) {
        Person p1 = new Person("hi", 789);
        System.out.println("Person name :"+p1.getname());
        p1.setage(458);
        System.out.println("Person age :"+p1.getage());
    }
}