class Customer{

        int customerId;
        String customerName;
        String city;
        String phoneNumber;

    public Customer(int  customerId,String customerName,String city,String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }
    void dispayCustomer(){
        System.out.println("Customer ID:"+customerId);
        System.out.println("CustomerName :"+customerName);
        System.out.println("City :"+city);
        System.out.println("PhoneNumber :"+phoneNumber);
        
    }

        

    public static void main(String[] args) {
        Customer c = new Customer(100, "ram", "chennai", "0123654789");
        Customer c1 = new  Customer(102, "rams", "chennai", "0177754789");

        c.dispayCustomer();
        c1.dispayCustomer();
    }
}