class Account{

int accountNumber;
String accountHolder;
String accountType;
double balance;
String branch;

    public Account() {
        this(123456789);
    }
    public Account(int  accountNumber){
        this(123456789,"ram","saving",15000,"trk");
    }
    public Account(int accountNumber, String accountHolder, String accountType, double balance, String branch) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = balance;
        this.branch = branch;
    }
    

    
    void displayAccount(){
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Account Type :"+accountType);
        System.out.println("Account Holder :"+accountHolder);
        System.out.println("Balance :"+balance);
        System.out.println("Branch :"+branch);
    }
    public static void main(String[] args) {
        Account a = new Account();
        a.displayAccount();
        
    }
}