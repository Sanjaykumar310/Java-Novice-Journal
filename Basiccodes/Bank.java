class Bank{

    String BankName;
    String Branch;
    String IFSCode;

    void displayBank(){
        System.out.println("BankName:"+BankName);
        System.out.println("Branch:"+Branch);
        System.out.println("IFSCode:"+IFSCode);
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.BankName = "SBI";
        b.Branch ="Chennai";
        b.IFSCode = "ABC12MZ";

        b.displayBank();
    }
}