import java.sql.*;

public class PTMS2DAO {

    private Connection conn;

    public PTMS2DAO(Connection conn) {
        this.conn = conn;
    }

    public void insertDepot(String name, String location) throws Exception {
        String sql = "INSERT INTO depots(name, location) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, location);
        ps.executeUpdate();
    }

    public void insertDriver(String name, int experience) throws Exception {
        String sql = "INSERT INTO drivers(name, experience_years) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setInt(2, experience);
        ps.executeUpdate();
    }

    public void insertRoute(String start, String end, int distance) throws Exception {
        String sql = "INSERT INTO routes(start_point, end_point, distance_km) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, start);
        ps.setString(2, end);
        ps.setInt(3, distance);
        ps.executeUpdate();
    }

    public void insertBus(String routeNumber, int capacity, int depotId) throws Exception {
        String sql = "INSERT INTO buses(route_number, capacity, depot_id) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, routeNumber);
        ps.setInt(2, capacity);
        ps.setInt(3, depotId);
        ps.executeUpdate();
    }

    public void insertCommuter(String name, double balance) throws Exception {
        String sql = "INSERT INTO commuters(name, card_balance) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setDouble(2, balance);
        ps.executeUpdate();
    }

    public void insertTrip(int busId, int driverId, int routeId, Date date) throws Exception {
        String sql = "INSERT INTO trips(bus_id, driver_id, route_id, trip_date) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, busId);
        ps.setInt(2, driverId);
        ps.setInt(3, routeId);
        ps.setDate(4, date);
        ps.executeUpdate();
    }

    public void insertPayment(int commuterId, int tripId, double amount) throws Exception {
        String sql = "INSERT INTO payments(commuter_id, trip_id, amount, payment_time) VALUES (?, ?, ?, NOW())";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, commuterId);
        ps.setInt(2, tripId);
        ps.setDouble(3, amount);
        ps.executeUpdate();
    }

    public void insertInspector(String name, String shift) throws Exception {
        String sql = "INSERT INTO inspectors(name, shift) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, shift);
        ps.executeUpdate();
    }
}
