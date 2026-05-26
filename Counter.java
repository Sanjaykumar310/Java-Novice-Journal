class Counter{
    static int count = 0;

    public static void main(String[] args) {
        //Counter.count = 3;
        Counter.count++;
        Counter.count++;
        Counter.count++;
        System.out.println(count);

    }
}