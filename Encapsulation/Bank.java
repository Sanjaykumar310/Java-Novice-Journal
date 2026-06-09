//Create a class BankAccount with a private field balance (double). Provide only a getter for balance — NO setter. Add a method deposit(double amount) that adds to balance. Show why this protects the data.
class Bank{
    private double balance;
    private double amount;

    public double getbalance(){
        return balance;
    }
    public double getamount(){
        return amount;
    }
    public void setamount(double amount){
        this.amount=amount;
    }
    public double deposit(double amount,double balance){
        return balance+amount;
    }

}