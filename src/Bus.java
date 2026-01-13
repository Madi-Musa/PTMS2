public class Bus {
    private int id;
    private String routeNumber;
    private int capacity;
    private int depotId; // foreign key

    public Bus(int id, String routeNumber, int capacity, int depotId) {
        this.id = id;
        this.routeNumber = routeNumber;
        this.capacity = capacity;
        this.depotId = depotId;
    }

    public int getId() {
        return id;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDepotId() {
        return depotId;
    }
}
