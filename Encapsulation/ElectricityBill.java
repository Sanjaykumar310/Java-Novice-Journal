class ElectricityBill{

        private int customerId;
        private String customerName;
        private int unitsConsumed;;
        private double ratePerUnit;
        private double totalBill;

        ElectricityBill(int  customerId,String customerName , int unitsConsumed , double ratePerUnit){
            this.customerId = customerId;
            this.customerName = customerName;
            this.ratePerUnit = ratePerUnit;
            this.unitsConsumed = unitsConsumed;
        }

        public void setcustomerName(String customerName){
            if (customerName == null || customerName.isEmpty()) {
                System.out.println("valid");
            }
            else{
                System.out.println("enter a valid name");
            }
        }
        public  String getcustomerName(){
            return customerName;
        }
        public void setunitsConsumed(int unitsConsumed){
            if(unitsConsumed >= 0){
            System.out.println("valid");
        }
        else{
            System.out.println("enter a valid");
        }
    }
    public int getunitsConsumed(){
        return unitsConsumed;
    }
    public void setratePerUnit(double ratePerUnit){
        if(ratePerUnit > 0){
           this.ratePerUnit = ratePerUnit;
        }
        else{
            System.out.println("enter a valid");
        }
    }
    public double getratePerUnit(){
        return ratePerUnit;
    }

    public void calculateBill(){
        System.out.println("Customer ID:"+customerId);
        System.out.println("Customer Name :"+customerName);
        System.out.println("UnitsConsumed :"+unitsConsumed);
        System.out.println("RatePerunits :"+ratePerUnit);
        System.out.println("Total Bill :"+totalBill);
    }
    public void displayBill(){
        if(totalBill > 0 && unitsConsumed > 0){

            System.out.println(unitsConsumed * 8.5);
        }
        else{
            System.out.println("enter a valid");
        }
    }

}