class BankAccount {
    private String accountNumber;
    public String holdername;
    public double balance;

    public BankAccount(String accountNumber,String holdername,double balance){
        this.accountNumber=accountNumber;
        this.holdername=holdername;
        this.balance=balance;
    }
    public double deposite(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("valid amount");
        }
        return balance;

    }
    public double withdraw(double amount){
        if(amount > 0){
            balance-=amount;
            System.out.println("balance amount");
        }
        else{
            System.out.println("insufficient amount");
        }
        return balance;

    }
    
}