
class Vehicle {

    private int vehicleNumber;
    private String vehicleType;

    public Vehicle(int vehicleNumber, String vehicleType) { // constructor
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber() {

        this.vehicleNumber = vehicleNumber;

    }

    public String getVehicleType() {

        return vehicleType;
    }

    public void setVehicleType() {
        this.vehicleType = vehicleType;
    }

    public void Vehicledetails(int vehicleNumber, String vehicleType) {//method
        System.out.println("vehicleNumber :" + vehicleNumber);
        System.out.println("vehicleType :" + vehicleType);
    }
}

class ParkingSlot {

    private int slotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;

    public int getslotNumber() {
        return slotNumber;
    }

    public void setslotNumber() {
        this.slotNumber = slotNumber;
    }

    public boolean getisOccupied() {
        return isOccupied;
    }

    public void setisOccupied() {
        this.isOccupied = isOccupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot(int slotNumber, boolean isOccupied) {//constructor
        this.slotNumber = slotNumber;
        this.isOccupied = isOccupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (slotNumber == 0) {
            System.out.println("park vehicle.");
        } else {
            System.out.println("Slot already occupied");
        }
    }

}

class Car {

    int carNumber;
    String brand;
    String color;

    public void Cardetails() {//method
        System.out.println("Car Number :" + carNumber);
        System.out.println("Brand :" + brand);
        System.out.println("Color :" + color);
    }

}
//level 4 pending so starthere4