class BankAccount{


    private long accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(long accountNumber,String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setaccountNumber(long accountNumber){
        if(accountNumber > 0){
            this.accountNumber = accountNumber;
        }
        else{
            System.out.println("Enter a valid details :");
        }
    }
    public long getaccountNumber(){
        return accountNumber;
    }
    public void setaccountHolder(String accountHolder){
        if(accountHolder != null){
            this.accountHolder = accountHolder;
        }
        else{
            System.out.println("Enter a valid details:");
        }

    }
    public String getaccountHolder(){
        return accountHolder;
    }
    public  void setbalance(double balance){
        if (balance >= 0){
            this.balance = balance;
        }
        else{
            System.out.println("Balance cannot be negative");
        }

    }
    public double getbalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposited :"+amount);
            System.out.println("Current Balance :"+ balance);
        }
        else{
            System.out.println("Deposit amount should be greater than 0");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("Withdraw :"+amount);
            System.out.println("Current Balance :"+ balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

}

class BankAccountdriver{
    public static void main(String[] args) {
        BankAccount b = new BankAccount(123456789, "Sanjay", 5000.0);
        b.deposit(2000.0);
        b.withdraw(1500.0);
        
    }
}