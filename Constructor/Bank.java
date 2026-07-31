class Bank{

        String bankName;
        String branch;
        String ifscCode;

    public Bank() {
    
         bankName = "SBI";
         branch = "chennai";
        ifscCode = "SBIN0001234";

    }

        void displayBank(){
            System.out.println("Bank Name :"+bankName);
            System.out.println("Branch :"+branch);
            System.out.println("IFSC CODE :"+ifscCode);
        }

    public static void main(String[] args) {
        Bank b = new  Bank();
        b.displayBank();

    }
}