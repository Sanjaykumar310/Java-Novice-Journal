class BankAccount {

    static String bankName = "SBI";//Static initializer
    static int totalAccounts = 0;//Static initializer

    String accountHolder;//non-Static initializer
    String accountType;//non-Static initializer
    int balance;//non-Static initializer

    static {//Multi-line-static initializer
        System.out.println("Bank: " + bankName);
    }

    {//non-static multiline static initializer
        totalAccounts++;
        System.out.println("Account block. Total: " + totalAccounts);
    }

    public BankAccount() {//no argument constructor
        this.accountHolder = "Unknown";
        this.accountType = "Savings";
        this.balance = 1000;
        System.out.println("Default account: " + this.accountHolder);
    }

    public BankAccount(String accountHolder, String accountType, int balance) {//parameterized constructor
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = balance;
        System.out.println("Param account: " + this.accountHolder);
    }

    public void showDetails() {//non-static methoad
        String accountHolder = "Ghost";
        System.out.println("Local: " + accountHolder);
        System.out.println("Field: " + this.accountHolder);
        System.out.println("Type: " + this.accountType);
        System.out.println("Balance: " + this.balance);
    }

    public static void bankInfo() {//static methoad
        System.out.println("Bank: " + bankName);
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {//main methoad
        System.out.println("Main start");
        BankAccount b1 = new BankAccount();//object creation
        BankAccount b2 = new BankAccount("Ravi", "Current", 50000);
        BankAccount b3 = new BankAccount("Priya", "Savings", 25000);
        b1.showDetails();
        b2.showDetails();
        b3.showDetails();
        BankAccount.bankInfo();
        System.out.println("Main end");
    }
}