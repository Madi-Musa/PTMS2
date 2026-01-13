public class Trip {
    private int id;
    private int busId;     // foreign key
    private int driverId;  // foreign key
    private int routeId;   // foreign key
    private String tripDate;

    public Trip(int id, int busId, int driverId, int routeId, String tripDate) {
        this.id = id;
        this.busId = busId;
        this.driverId = driverId;
        this.routeId = routeId;
        this.tripDate = tripDate;
    }

    public int getId() {
        return id;
    }

    public int getBusId() {
        return busId;
    }

    public int getDriverId() {
        return driverId;
    }

    public int getRouteId() {
        return routeId;
    }

    public String getTripDate() {
        return tripDate;
    }
}
