class Device{
    public void poweron(){
        System.out.println("Device is ON");
    }
}

class Laptop extends Device{
    public void code(){
        System.out.println("Coding in Java");
    }
}

class Devicedriver{
    public static void main(String[] args) {
        Device d1 = new Device();
        d1.poweron();
        Laptop l1 = new Laptop();
        l1.code();
    }
}