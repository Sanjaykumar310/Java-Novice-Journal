class Vehicle {

    private String vehicleNumber;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void vehicleDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type : " + vehicleType);
    }
}


class ParkingSlot {

    private int slotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSlot(int slotNumber, boolean isOccupied) {
        this.slotNumber = slotNumber;
        this.isOccupied = isOccupied;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void parkVehicle(Vehicle vehicle) {

        if (!isOccupied) {
            this.vehicle = vehicle;
            this.isOccupied = true;

            System.out.println("Vehicle parked successfully.");
        } else {
            System.out.println("Slot already occupied.");
        }
    }

    public void removeVehicle() {

        this.vehicle = null;
        this.isOccupied = false;

        System.out.println("Vehicle removed.");
    }

    public void displaySlotDetails() {

        System.out.println("Slot Number : " + slotNumber);

        if (isOccupied) {
            System.out.println("Status : Occupied");
            System.out.println("Vehicle Number : "
                    + vehicle.getVehicleNumber());
            System.out.println("Vehicle Type : "
                    + vehicle.getVehicleType());
        } else {
            System.out.println("Status : Available");
        }
    }
}