class Circledriver{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("RADIUS:"+c1.getRadius(48));
        c1.setRadius(-2);
        System.out.println("AFTER UPDATE THE VALUE:"+c1.getRadius());
    }
}