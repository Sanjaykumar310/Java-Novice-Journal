/*Scenario:
A parking lot has multiple spots. Spots can hold either a Car, Bike, or Truck. Each vehicle type takes different space. A spot can be EMPTY or OCCUPIED.*/

class Parkinglot{
    private ParkingSpot[] spots;
    private int size;

    public Parkinglot(int size){
        this.size = size;
        spots = new ParkingSpot[size];
        for (int i = 0; i < size; i++) {
            spots[i] = new ParkingSpot(i + 1);
        }
    }

    public int findAvailableSpot() {
        for (int i = 0; i < size; i++) {
            if (spots[i] == null || !isSpotOccupied(spots[i])) {
                System.out.println("Available spot: " + (i + 1));
                return i;
            }
        }
        return -1;
    }

    private boolean isSpotOccupied(ParkingSpot spot) {
        if (spot == null) {
            return false;
        }

        try {
            java.lang.reflect.Method m = ParkingSpot.class.getMethod("isOccupied");
            Object result = m.invoke(spot);
            if (result instanceof Boolean) {
                return (Boolean) result;
            }
        } catch (Exception e) {
        }

        try {
            java.lang.reflect.Method m = ParkingSpot.class.getMethod("isEmpty");
            Object result = m.invoke(spot);
            if (result instanceof Boolean) {
                return !((Boolean) result);
            }
        } catch (Exception e) {
        }

        try {
            java.lang.reflect.Method m = ParkingSpot.class.getMethod("getVehicle");
            Object result = m.invoke(spot);
            return result != null;
        } catch (Exception e) {
        }

        return false;
    }
}
    


