class Banking{

private String cardNumber;
private String cardHolder;
private double creditLimit;
private double usedAmount;

    Banking(){
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        
    }
     public Banking(double creditLimit, double usedAmount) {
        this.creditLimit = creditLimit;
        this.usedAmount = usedAmount;
    }


    public String getcardNumber(){//getter method
        return cardNumber;
    }
    public void setcardNumber(String cardNumber){//settermethod
        if(cardNumber != null && cardNumber.length() >= 16){
            this.cardNumber = cardNumber;
        }
        else{
            System.out.println("enter a vald number:");
        }
    }
    public String getcardHolder(){
        return cardHolder;
    }
    public void setcardHolder(String cardHolder){
        if(cardHolder != null || cardHolder.isEmpty()){
            this.cardHolder = cardHolder;
        }
        else{
            System.out.println("enter a valid details:");
        }
    }
    public double getcreaditLimit(){
        return creditLimit;
    }
    public void setcreditLimit(double creditLimit){
        if(creditLimit > 10000){
            this.creditLimit = creditLimit;
        }
        else{
            System.out.println("enter a valid details :");
        }

    }
    public double getusedAmount(){
        return usedAmount;
    }
    public void setusedAmount(double usedAmount){
        if(usedAmount < creditLimit){
            this.usedAmount = usedAmount;

        }
        else{
            System.out.println("enter a valid details");
        }

    }
    public void swipCard(double usedAmount){
        System.out.println("UsedAmount :"+usedAmount);
    }
    public void payBill(double usedAmount){
        System.out.println("PayBill :"+usedAmount);
    }
    public double getAvailableLimit(){
        //System.out.println("Available amount: " + b.getAvailableLimit());
        return usedAmount - creditLimit  ;
    }

}

class Bankingdriver{
    public static void main(String[] args) {
        Banking b = new Banking(1200.0,1500.0);
        b.swipCard(200.0);
        b.payBill(1000.0);
        System.out.println("Available amount: "+b.getAvailableLimit());
    }
}