class ElectricityBilldriver{
    public static void main(String[] args) {
        ElectricityBill e = new ElectricityBill(101, "Sanjay", 250, 8.5);
        ElectricityBill e1 = new ElectricityBill(102, "Rahul", 350, 9.25);

        e.calculateBill();
        e.displayBill();
    }
}