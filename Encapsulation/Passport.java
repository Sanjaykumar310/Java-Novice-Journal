class Passport{

        private String passportNumber;
        private String holderName;
        private String nationality;
        private int expiryYear;

    public Passport(String passportNumber, String holderName, String nationality, int expiryYear) {
        this.passportNumber = passportNumber;
        this.holderName = holderName;
        this.nationality = nationality;
        this.expiryYear = expiryYear;
    }

    public void setpassportNumber(String passportNumber){//setter method

    if(passportNumber == null || passportNumber.isEmpty()){
        System.out.println("valid");
    }
    else{
        System.out.println("enter valid number");
    }
}

    public String getpassportNumber(){//getter method
        return passportNumber;
    }
    public void setholderName(String holderName){
        if(holderName == null || holderName.isEmpty()){
            System.out.println("valid");
        }
        else{
            System.out.println("enter valid name");
        }

    }
    public String getholderName(){
        return holderName;
    }
    public void setexpiryYear(int expiryYear){
        if(expiryYear > 2026){
            System.out.println("valid");
        }
        else{
            System.out.println("Passport Expired");
        }
    }
    public int getexpiryYear(){
        return expiryYear;
    }
    public void setnationality(String nationality){
        if(nationality == null || nationality.isEmpty()){
            System.out.println("valid");

        }
        else{
            System.out.println("not valid");
        }
    }
    public String getnationality(){
        return nationality;
    }

    public void displayPassport(){
        System.out.println("PassportNumber :"+passportNumber);
        System.out.println("Holder Name:"+holderName);
        System.out.println("Nationality :"+nationality);
        System.out.println("Expiry Year :"+expiryYear);
    }
}

class Passportdriver{

    public static void main(String[] args) {
        Passport p = new Passport("1234567", "sam", "usa", 2024);
        p.displayPassport();
    }

}