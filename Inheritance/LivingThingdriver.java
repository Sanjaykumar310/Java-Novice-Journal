class LivingThingdriver{
    public static void main(String[] args) {
        Parrot p1 = new Parrot();
        System.out.println(p1 instanceof Parrot);
        System.out.println(p1 instanceof Bird);
        System.out.println(p1 instanceof LivingThing);
    }
}