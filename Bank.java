class Bank{
    String owner;
    double balance;

    public void deposit(double amount) {
        //add amount to balance
        balance = amount+balance;
        System.out.println("current amount :"+ balance);

    }
    public void Balance(){
        System.out.println("owner : "+owner);
    }
    public static void main(String[] args) {
        Bank B1 = new Bank();
        B1.deposit(1000);
        B1.Balance();
    

        
    }
}