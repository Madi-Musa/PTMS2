public class Route {
    private int id;
    private String startPoint;
    private String endPoint;
    private int distanceKm;

    public Route(int id, String startPoint, String endPoint, int distanceKm) {
        this.id = id;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.distanceKm = distanceKm;
    }

    public int getId() {
        return id;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public int getDistanceKm() {
        return distanceKm;
    }
}
