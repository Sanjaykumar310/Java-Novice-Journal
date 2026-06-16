class Gadgetdriver{
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        System.out.println(s1 instanceof Smartphone);
        System.out.println(s1 instanceof Phone);
        System.out.println(s1 instanceof Gadget);
    }
}