class Bankdriver{
    public static void main(String[] args) {
        Bank b1 =new Bank();
        System.out.println(b1.deposit(25.2,45.0));
        b1.setamount(525.0);
        System.out.println("AFTER UPDATION AMOUNT:"+b1.getamount());
    }
}