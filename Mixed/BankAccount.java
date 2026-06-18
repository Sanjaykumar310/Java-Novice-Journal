class BankAccount {
    private String accountNumber;
    private  String holdername;
    private  double balance;

    public BankAccount(String accountNumber,String holdername,double balance){
        this.accountNumber=accountNumber;
        this.holdername=holdername;
        this.balance=balance;
    }
    public double deposite(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("Valid Amount");
            System.out.println("Deposited amount="+amount);
        }
        return balance;

    }
    public double withdraw(double amount){
        if(amount > 0){
            balance-=amount;
            System.out.println("balance amount="+amount);
        }
        else{
            System.out.println("insufficient amount");
        }
        return balance;

    }
    public double getbalance(){//getters method only reads
        return balance;
    }
    public void setbalance(double balance){//setter method update the value or data
        this.balance=balance;
    }
    
}

class Bankdriver{
    public static void main(String[] args) {
        
    
    BankAccount b1 = new BankAccount("154268792", "rams", 45.2);
        b1.withdraw(30.0);
        b1.deposite(45.0);
  }
}