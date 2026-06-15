class BankAccountdriver{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.showBalance(10000);
        SavingsAccount s1 = new SavingsAccount();
        s1.addInterest();
        CurrentAccount c1 = new CurrentAccount();
        c1.deductcharge();
    }
}