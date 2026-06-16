class Bank{
    public String interestrate(){
        return "Bank interest: 4%";
    }
}

class SBI extends Bank{
    @Override
    public String interestrate(){
        return "SBI interest: 7%";
    }
}

class HDFC extends Bank{
    @Override
    public String interestrate(){
        return "HDFC interest: 8%";
    }
}

class Bankdriver{
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        System.out.println(b1.interestrate());//"SBI interest: 7%"
        System.out.println(b2.interestrate());//"HDFC interest: 8%"
    }
}