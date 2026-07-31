class Passport{

        String passportNumber;
        String holderName;
        String nationality;
        int expiryYear;

        Passport(String passportNumber,String holderName,String nationality,int expiryYear){
            this.passportNumber = passportNumber;
            this.holderName = holderName;
            this.nationality = nationality;
            this. expiryYear = expiryYear; 
        }

        void displayPassport(){
            System.out.println("PassportNumber :"+passportNumber);
            System.out.println("HolderName :"+holderName);
            System.out.println("Nationality :"+nationality);
            System.out.println("ExpiryYear :"+expiryYear);
        }

    public static void main(String[] args) {
        
        Passport p = new Passport("121","Ram","Indian",2027);

        p.displayPassport();
    }
}