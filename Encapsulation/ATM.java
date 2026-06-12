//Create a class ATM with a private field balance (double, initialized to 1000). Add method withdraw(double amount) — it should fail if amount > balance or amount <= 0. Add getBalance(). Test multiple withdrawals in main().
class ATM{
    private double balance = 1000;



    public double withdraw(double amount){
        if(amount > balance || amount <= 0){
            System.out.println("VALID");

        }
        else{
            System.out.println("INVALID");

        }
        return amount;
    }
    public double getbalance(){
        return balance;
    }

}