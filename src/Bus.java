public class Bus {
    private int id;
    private String routeNumber;
    private int capacity;

    public Bus(String routeNumber, int capacity) {
        this.routeNumber = routeNumber;
        this.capacity = capacity;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public int getCapacity() {
        return capacity;
    }
}
