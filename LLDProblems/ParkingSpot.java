class ParkingSpot {

    private boolean isOccupied;
    private int spotNumber;
    private Vehicle vehicle;

    // Constructor
    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
        this.vehicle = null;
    }

    // Park a vehicle
    public void parkVehicle(Vehicle v) {
        vehicle = v;
        isOccupied = true;
    }

    // Remove a vehicle
    public void removeVehicle() {
        vehicle = null;
        isOccupied = false;
    }

    // Getter
    public boolean getIsOccupied() {
        return isOccupied;
    }

    // Setter
    public void setIsOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    // Getter
    public int getSpotNumber() {
        return spotNumber;
    }

    // Setter
    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    // Getter
    public Vehicle getVehicle() {
        return vehicle;
    }

    // Setter
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}